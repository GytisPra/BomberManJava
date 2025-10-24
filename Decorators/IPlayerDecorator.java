package Decorators;

import Enums.PowerUpType;
import Models.Player;

public interface IPlayerDecorator
{
    int getBombCount();
    int getBombRange();
    int getMovementSpeed();
    void applyPowerUp(PowerUpType type);
    Player getBasePlayer();
}