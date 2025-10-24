package Models;

import Singletons.GameConfiguration;
import Strategies.*;

public class Player implements Cloneable {

    private final GameConfiguration config = GameConfiguration.getInstance();

    private String id = "";
    private String name = "";
    private int x = 1;
    private int y = 1;
    private boolean isAlive = true;
    private int bombCount;
    private int bombRange;
    private String color = "#ff0000";

    private IPlayerMovementStrategy movementStrategy = new NormalMovementStrategy();
    private double speed;

    public Player() {
        this.bombCount = config.getDefaultBombCount();
        this.bombRange = config.getDefaultBombRange();
        updateSpeed();
    }

    // -----------------------
    // Getters and Setters
    // -----------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        updateSpeed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getBombCount() {
        return bombCount;
    }

    public void setBombCount(int bombCount) {
        this.bombCount = bombCount;
    }

    public int getBombRange() {
        return bombRange;
    }

    public void setBombRange(int bombRange) {
        this.bombRange = bombRange;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IPlayerMovementStrategy getMovementStrategy() {
        return movementStrategy;
    }

    public void setMovementStrategy(IPlayerMovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
        updateSpeed();
    }

    public double getSpeed() {
        return speed;
    }

    // -----------------------
    // Private methods
    // -----------------------

    private void updateSpeed() {
        int baseCooldown = movementStrategy.getBaseMovementCooldownMs();
        int effectiveCooldown = MovementCooldownTracker.getEffectiveCooldown(id, baseCooldown);
        // round to 2 decimals
        this.speed = Math.round((100.0 / effectiveCooldown) * 100.0) / 100.0;
    }

    // -----------------------
    // Clone
    // -----------------------

    @Override
    public Player clone() {
        IPlayerMovementStrategy clonedStrategy;

        if (movementStrategy instanceof SpeedBoostMovementStrategy) {
            clonedStrategy = new SpeedBoostMovementStrategy();
        } else if (movementStrategy instanceof SlowMovementStrategy) {
            clonedStrategy = new SlowMovementStrategy();
        } else {
            clonedStrategy = new NormalMovementStrategy();
        }

        Player p = new Player();
        p.id = this.id;
        p.name = this.name;
        p.x = this.x;
        p.y = this.y;
        p.isAlive = this.isAlive;
        p.bombCount = this.bombCount;
        p.bombRange = this.bombRange;
        p.color = this.color;
        p.movementStrategy = clonedStrategy;
        p.updateSpeed();
        return p;
    }
}
