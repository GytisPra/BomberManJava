package Factories;

import Enums.PowerUpType;
import Models.PowerUp;

public class StandardPowerUpFactory extends PowerUpFactory
{
    @Override
    public PowerUp createPowerUp(int x, int y, PowerUpType type)
    {
        var powerUp = new PowerUp();
        powerUp.setX(x);
        powerUp.setY(y);
        powerUp.setType(type);

        return powerUp;
    }
}
