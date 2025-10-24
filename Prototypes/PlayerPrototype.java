package Prototypes;

import Models.Player;
import Strategies.*;

public class PlayerPrototype implements IPrototype<Player> {

    private final Player template;

    public PlayerPrototype(Player template) {
        this.template = template;
    }

    // -----------------------
    // Deep clone
    // -----------------------
    @Override
    public Player clone() {
        IPlayerMovementStrategy newStrategy;

        if (template.getMovementStrategy() instanceof NormalMovementStrategy) {
            newStrategy = new NormalMovementStrategy();
        } else if (template.getMovementStrategy() instanceof SpeedBoostMovementStrategy) {
            newStrategy = new SpeedBoostMovementStrategy();
        } else if (template.getMovementStrategy() instanceof SlowMovementStrategy) {
            newStrategy = new SlowMovementStrategy();
        } else {
            newStrategy = new NormalMovementStrategy();
        }

        Player p = new Player();
        p.setId(template.getId());
        p.setName(template.getName());
        p.setX(template.getX());
        p.setY(template.getY());
        p.setAlive(template.isAlive());
        p.setBombCount(template.getBombCount());
        p.setBombRange(template.getBombRange());
        p.setColor(template.getColor());
        p.setMovementStrategy(newStrategy);

        return p;
    }

    // -----------------------
    // Shallow clone
    // -----------------------
    @Override
    public Player cloneShallow() {
        Player p = new Player();
        p.setId(template.getId());
        p.setName(template.getName());
        p.setX(template.getX());
        p.setY(template.getY());
        p.setAlive(template.isAlive());
        p.setBombCount(template.getBombCount());
        p.setBombRange(template.getBombRange());
        p.setColor(template.getColor());
        p.setMovementStrategy(template.getMovementStrategy());

        return p;
    }
}
