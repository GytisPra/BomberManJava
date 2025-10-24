package Builders;

import Models.Player;
import Strategies.IPlayerMovementStrategy;

public interface IPlayerBuilder
{
    IPlayerBuilder withId(String id);
    IPlayerBuilder withName(String name);
    IPlayerBuilder withPosition(int x, int y);
    IPlayerBuilder withColor(String color);
    IPlayerBuilder withBombCount(int count);
    IPlayerBuilder withBombRange(int range);
    IPlayerBuilder withMovementStrategy(IPlayerMovementStrategy strategy);
    Player build();
}