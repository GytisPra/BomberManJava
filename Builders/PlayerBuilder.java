package Builders;

import Models.Player;
import Strategies.IPlayerMovementStrategy;
import Strategies.NormalMovementStrategy;

public class PlayerBuilder implements IPlayerBuilder {
    private String id = "";
    private String name = "";
    private int x = 1;
    private int y = 1;
    private String color = "#ff0000";
    private int bombCount = 1;
    private int bombRange = 2;
    private IPlayerMovementStrategy movementStrategy = new NormalMovementStrategy();

    @Override
    public IPlayerBuilder withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public IPlayerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IPlayerBuilder withPosition(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public IPlayerBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public IPlayerBuilder withBombCount(int count) {
        this.bombCount = count;
        return this;
    }

    @Override
    public IPlayerBuilder withBombRange(int range) {
        this.bombRange = range;
        return this;
    }

    @Override
    public IPlayerBuilder withMovementStrategy(IPlayerMovementStrategy strategy) {
        this.movementStrategy = strategy;
        return this;
    }

    @Override
    public Player build() {
        Player player = new Player();
        player.setId(id);
        player.setName(name);
        player.setX(x);
        player.setY(y);
        player.setColor(color);
        player.setBombCount(bombCount);
        player.setBombRange(bombRange);
        player.setMovementStrategy(movementStrategy);
        player.setAlive(true);

        // Optionally reset builder for reuse
        id = "";
        name = "";
        x = 1;
        y = 1;
        color = "#ff0000";
        bombCount = 1;
        bombRange = 2;
        movementStrategy = new NormalMovementStrategy();

        return player;
    }
}
