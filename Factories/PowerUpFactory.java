package Factories;

import Enums.PowerUpType;
import Models.PowerUp;

abstract class PowerUpFactory {
    public abstract PowerUp createPowerUp(int x, int y, PowerUpType type);

    protected double getRarityModifier() {
        return 1.0;
    }
}