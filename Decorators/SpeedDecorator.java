package Decorators;

import Enums.PowerUpType;
import Models.Player;

public class SpeedDecorator implements IPlayerDecorator {
    private final IPlayerDecorator decorated;
    private final int additionalSpeed;

    public SpeedDecorator(IPlayerDecorator decorated, int additionalSpeed) {
        this.decorated = decorated;
        this.additionalSpeed = additionalSpeed;
    }

    @Override
    public int getBombCount() {
        return decorated.getBombCount();
    }

    @Override
    public int getBombRange() {
        return decorated.getBombRange();
    }

    @Override
    public int getMovementSpeed() {
        return decorated.getMovementSpeed() + additionalSpeed;
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