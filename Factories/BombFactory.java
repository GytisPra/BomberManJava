package Factories;

import Models.Bomb;

public abstract class BombFactory {
    public abstract Bomb createBomb(int x, int y, String playerId, int range);
    public Bomb createAndLogBomb(int x, int y, String playerId, int range) { return null; }
}
