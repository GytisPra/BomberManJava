package Factories;

import Enums.PowerUpType;
import Models.Explosion;
import Models.PowerUp;

public class ClassicThemeFactory implements IGameThemeFactory {

    public PowerUp createPowerUp(int x, int y, PowerUpType type) {
        var powerUp = new PowerUp();

        powerUp.setX(x);
        powerUp.setY(y);
        powerUp.setType(type);

        return powerUp;
    }

    @Override
    public Explosion createExplosion(int x, int y) {
        var explosion = new Explosion();
        explosion.setX(x);
        explosion.setY(y);

        return explosion;
    }

    @Override
    public String getThemeName() {
        return "Classic";
    }

    @Override
    public String getThemeColor() {
        return "#FF6B00";
    }
}
