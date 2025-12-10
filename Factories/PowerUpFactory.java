package Factories;

import Models.PowerUp;
import Enums.PowerUpType;

public abstract class PowerUpFactory {
    public abstract PowerUp createPowerUp(int x, int y, PowerUpType type);
}
