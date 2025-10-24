package Decorators;

import Enums.PowerUpType;
import Models.Player;

public class BombRangeDecorator implements IPlayerDecorator {
    private final IPlayerDecorator decorated;
    private final int additionalRange;

    public BombRangeDecorator(IPlayerDecorator decorated, int additionalRange) {
        this.decorated = decorated;
        this.additionalRange = additionalRange;
    }

    @Override
    public int getBombCount() {
        return decorated.getBombCount();
    }

    @Override
    public int getBombRange() {
        return decorated.getBombRange() + additionalRange;
    }

    @Override
    public int getMovementSpeed() {
        return decorated.getMovementSpeed();
    }

    @Override
    public void applyPowerUp(PowerUpType type) {
        decorated.applyPowerUp(type);
    }

    @Override
    public Player getBasePlayer() {
        return decorated.getBasePlayer();
    }
}