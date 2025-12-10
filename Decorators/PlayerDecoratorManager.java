package Decorators;

import java.util.Map;
import Models.Player;

public class PlayerDecoratorManager {
    private Map<String, IPlayerDecorator> playerDecorators;

    public void registerPlayer(Player player) {}
    public void applyBombUpgrade(String playerId) {}
    public void applyRangeUpgrade(String playerId) {}
    public void applySpeedUpgrade(String playerId) {}
    public int getEffectiveBombCount(String playerId) { return 0; }
    public int getEffectiveBombRange(String playerId) { return 0; }
    public double getEffectiveSpeed(String playerId) { return 0; }
}
