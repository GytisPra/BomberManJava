package Decorators;

import java.util.HashMap;
import java.util.Map;

import Models.Player;

public class PlayerDecoratorManager {
    private final Map<String, IPlayerDecorator> decoratedPlayers = new HashMap<>();

    public void registerPlayer(Player player) {
        decoratedPlayers.put(player.getId(), new BasePlayerDecorator(player));
    }

    public void applyBombUpgrade(String playerId) {
        IPlayerDecorator decorator = decoratedPlayers.get(playerId);
        if (decorator != null) {
            decoratedPlayers.put(playerId, new BombCountDecorator(decorator, 1));
        }
    }

    public void applyRangeUpgrade(String playerId) {
        IPlayerDecorator decorator = decoratedPlayers.get(playerId);
        if (decorator != null) {
            decoratedPlayers.put(playerId, new BombRangeDecorator(decorator, 1));
        }
    }

    public void applySpeedUpgrade(String playerId) {
        IPlayerDecorator decorator = decoratedPlayers.get(playerId);
        if (decorator != null) {
            decoratedPlayers.put(playerId, new SpeedDecorator(decorator, 1));
        }
    }

    public IPlayerDecorator getDecoratedPlayer(String playerId) {
        return decoratedPlayers.get(playerId);
    }

    public int getEffectiveBombCount(String playerId) {
        IPlayerDecorator decorator = decoratedPlayers.get(playerId);
        return decorator != null ? decorator.getBombCount() : 1;
    }

    public int getEffectiveBombRange(String playerId) {
        IPlayerDecorator decorator = decoratedPlayers.get(playerId);
        return decorator != null ? decorator.getBombRange() : 2;
    }

    public int getEffectiveSpeed(String playerId) {
        IPlayerDecorator decorator = decoratedPlayers.get(playerId);
        return decorator != null ? decorator.getMovementSpeed() : 1;
    }

    public void removePlayer(String playerId) {
        decoratedPlayers.remove(playerId);
    }
}
