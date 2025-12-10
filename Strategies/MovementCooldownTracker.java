package Strategies;

import java.util.Map;

public class MovementCooldownTracker {
    private static Map<String, Long> lastMoveTimes;
    private static Map<String, Integer> speedBoostCounts;

    public static boolean canMoveNow(String playerId, int cooldownMs) { return false; }
    public static void recordMove(String playerId) {}
    public static int getEffectiveCooldown(String playerId, int baseCooldown) { return 0; }
    public static void addSpeedBoost(String playerId) {}
    public static int getSpeedBoostCount(String playerId) { return 0; }
    public static void resetSpeedBoosts(String playerId) {}
}
