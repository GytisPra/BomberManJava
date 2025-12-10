package Factories;

import Models.*;

public class NeonThemeFactory implements IGameThemeFactory {
    public Bomb createBomb(int x, int y, String playerId, int range) { return null; }
    public PowerUp createPowerUp(int x, int y, Enums.PowerUpType type) { return null; }
    public Explosion createExplosion(int x, int y) { return null; }
    public String getThemeName() { return null; }
}
