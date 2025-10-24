package Factories;

import Models.Bomb;

public abstract class BombFactory {

    public abstract Bomb createBomb(int x, int y, String playerId, int range);

    public Bomb createAndLogBomb(int x, int y, String playerId, int range) {
        Bomb bomb = createBomb(x, y, playerId, range);
        System.out.println("[Factory Method] Created " + bomb.getClass().getSimpleName() +
                " at (" + x + ", " + y + ")");
        return bomb;
    }
}

// --- Standard Bomb Factory ---
class StandardBombFactory extends BombFactory {

    @Override
    public Bomb createBomb(int x, int y, String playerId, int range) {
        Bomb bomb = new Bomb();
        bomb.setX(x);
        bomb.setY(y);
        bomb.setPlayerId(playerId);
        bomb.setRange(range);
        return bomb;
    }
}

// --- Enhanced Bomb Factory ---
class EnhancedBombFactory extends BombFactory {

    @Override
    public Bomb createBomb(int x, int y, String playerId, int range) {
        Bomb bomb = new Bomb();
        bomb.setX(x);
        bomb.setY(y);
        bomb.setPlayerId(playerId);
        bomb.setRange(range + 1);
        return bomb;
    }
}
