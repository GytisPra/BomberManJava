package Builders;

import Models.Player;
import Strategies.IPlayerMovementStrategy;

public class PlayerBuilder implements IPlayerBuilder {
    private Player player;

    public PlayerBuilder() {}

    public IPlayerBuilder withId(String id) { return null; }
    public IPlayerBuilder withName(String name) { return null; }
    public IPlayerBuilder withPosition(int x, int y) { return null; }
    public IPlayerBuilder withBombCount(int count) { return null; }
    public IPlayerBuilder withBombRange(int range) { return null; }
    public IPlayerBuilder withColor(String color) { return null; }
    public IPlayerBuilder withMovementStrategy(IPlayerMovementStrategy strategy) { return null; }
    public Player build() { return null; }
}
