package Models;

import Singletons.GameConfiguration;
import Strategies.*;

public class Player implements Cloneable {

    private GameConfiguration config;
    private String id;
    private String name;
    private int x;
    private int y;
    private boolean isAlive;
    private int bombCount;
    private int bombRange;
    private String color;
    private IPlayerMovementStrategy movementStrategy;
    private double speed;

    public Player() {}

    public String getId() { return null; }
    public void setId(String id) {}
    public String getName() { return null; }
    public void setName(String name) {}
    public int getX() { return 0; }
    public void setX(int x) {}
    public int getY() { return 0; }
    public void setY(int y) {}
    public boolean isAlive() { return false; }
    public void setAlive(boolean alive) {}
    public int getBombCount() { return 0; }
    public void setBombCount(int bombCount) {}
    public int getBombRange() { return 0; }
    public void setBombRange(int bombRange) {}
    public String getColor() { return null; }
    public void setColor(String color) {}
    public IPlayerMovementStrategy getMovementStrategy() { return null; }
    public void setMovementStrategy(IPlayerMovementStrategy movementStrategy) {}
    public double getSpeed() { return 0; }

    private void updateSpeed() {}

    @Override
    public Player clone() { return null; }
}
