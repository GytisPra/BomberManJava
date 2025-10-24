package Strategies;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MovementCooldownTracker {

    private static final ConcurrentMap<String, Long> lastMoveTime = new ConcurrentHashMap<>();
    private static final ConcurrentMap<String, Integer> speedBoostCount = new ConcurrentHashMap<>();

    private static final int SPEED_BOOST_REDUCTION_MS = 20;
    private static final int MINIMUM_COOLDOWN_MS = 50;

    public static boolean canMoveNow(String playerId, int baseCooldownMs) {
        int effectiveCooldown = getEffectiveCooldown(playerId, baseCooldownMs);

        long now = System.currentTimeMillis();
        Long lastMove = lastMoveTime.get(playerId);

        if (lastMove == null) {
            lastMoveTime.put(playerId, now);
            return true;
        }

        long timeSinceLastMove = now - lastMove;
        if (timeSinceLastMove >= effectiveCooldown) {
            lastMoveTime.put(playerId, now);
            return true;
        }

        return false;
    }

    public static void addSpeedBoost(String playerId) {
        speedBoostCount.merge(playerId, 1, Integer::sum);
    }

    public static int getSpeedBoostCount(String playerId) {
        return speedBoostCount.getOrDefault(playerId, 0);
    }

    public static int getEffectiveCooldown(String playerId, int baseCooldownMs) {
        int boostCount = getSpeedBoostCount(playerId);
        int reduction = boostCount * SPEED_BOOST_REDUCTION_MS;
        return Math.max(baseCooldownMs - reduction, MINIMUM_COOLDOWN_MS);
    }

    public static void resetPlayer(String playerId) {
        lastMoveTime.remove(playerId);
        speedBoostCount.remove(playerId);
    }
}
