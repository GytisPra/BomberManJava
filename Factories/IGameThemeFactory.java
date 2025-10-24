package Factories;

import Enums.PowerUpType;
import Models.Explosion;
import Models.PowerUp;

public interface IGameThemeFactory {
    PowerUp createPowerUp(int x, int y, PowerUpType type);

    Explosion createExplosion(int x, int y);

    String getThemeName();

    String getThemeColor();
}
