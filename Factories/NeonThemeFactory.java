package Factories;

import Enums.PowerUpType;
import Models.Explosion;
import Models.PowerUp;

public class NeonThemeFactory implements IGameThemeFactory {
    @Override
    public PowerUp createPowerUp(int x, int y, PowerUpType type) {
        var powerUp = new PowerUp();
        powerUp.setType(type);
        powerUp.setX(x);
        powerUp.setY(y);

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
        return "Neon";
    }

    @Override
    public String getThemeColor() {
        return "#00FFFF";
    }
}
