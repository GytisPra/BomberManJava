package Decorators;

import Enums.PowerUpType;
import Models.Player;

public class BasePlayerDecorator implements IPlayerDecorator {
    protected Player player;

    public BasePlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public int getBombCount() {
        return player.getBombCount();
    }

    @Override
    public int getBombRange() {
        return player.getBombRange();
    }

    @Override
    public int getMovementSpeed() {
        return 1;
    }

    @Override
    public void applyPowerUp(PowerUpType type) {
        switch (type) {
            case BombUp:
                player.setBombCount(player.getBombCount() + 1);
                break;
            case RangeUp:
                player.setBombRange(player.getBombRange() + 1);
                break;
            case SpeedUp:
                // speed-related logic would go here
                break;
        }
    }

    public Player getBasePlayer() {
        return player;
    }
}
