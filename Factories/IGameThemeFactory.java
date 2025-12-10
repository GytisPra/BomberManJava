package Factories;

import Models.*;

public interface IGameThemeFactory {
    Bomb createBomb(int x, int y, String playerId, int range);
    PowerUp createPowerUp(int x, int y, Enums.PowerUpType type);
    Explosion createExplosion(int x, int y);
    String getThemeName();
}
