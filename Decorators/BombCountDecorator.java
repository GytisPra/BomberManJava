package Decorators;

import Enums.PowerUpType;
import Models.Player;

public class BombCountDecorator implements IPlayerDecorator {
    private final IPlayerDecorator decorated;
    private final int additionalBombs;

    public BombCountDecorator(IPlayerDecorator decorated, int additionalBombs) {
        this.decorated = decorated;
        this.additionalBombs = additionalBombs;
    }

    @Override
    public int getBombCount() {
        return decorated.getBombCount() + additionalBombs;
    }

    @Override
    public int getBombRange() {
        return decorated.getBombRange();
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