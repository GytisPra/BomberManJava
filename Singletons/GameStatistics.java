package Singletons;

import java.time.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public final class GameStatistics {
    private static GameStatistics instance;

    private final ConcurrentHashMap<String, AtomicInteger> playerWins = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AtomicInteger> playerGamesPlayed = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AtomicInteger> playerBombsPlaced = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AtomicInteger> playerKills = new ConcurrentHashMap<>();

    private final AtomicInteger totalGames = new AtomicInteger(0);
    private final AtomicInteger totalBombsExploded = new AtomicInteger(0);
    private Instant startTime = Instant.now();

    private GameStatistics() {}

    public static synchronized GameStatistics getInstance() {
        if (instance == null) {
            instance = new GameStatistics();
        }
        return instance;
    }

    public void recordGamePlayed(String playerId) {
        playerGamesPlayed.compute(playerId, (k, v) -> v == null ? new AtomicInteger(1) : new AtomicInteger(v.incrementAndGet()));
        totalGames.incrementAndGet();
    }

    public void recordWin(String playerId) {
        playerWins.compute(playerId, (k, v) -> v == null ? new AtomicInteger(1) : new AtomicInteger(v.incrementAndGet()));
    }

    public void recordBombPlaced(String playerId) {
        playerBombsPlaced.compute(playerId, (k, v) -> v == null ? new AtomicInteger(1) : new AtomicInteger(v.incrementAndGet()));
    }

    public void recordBombExploded() {
        totalBombsExploded.incrementAndGet();
    }

    public void recordKill(String killerId) {
        playerKills.compute(killerId, (k, v) -> v == null ? new AtomicInteger(1) : new AtomicInteger(v.incrementAndGet()));
    }

    public int getPlayerWins(String playerId) {
        return playerWins.getOrDefault(playerId, new AtomicInteger(0)).get();
    }

    public int getPlayerGamesPlayed(String playerId) {
        return playerGamesPlayed.getOrDefault(playerId, new AtomicInteger(0)).get();
    }

    public double getPlayerWinRate(String playerId) {
        int games = getPlayerGamesPlayed(playerId);
        if (games == 0) return 0;
        return (double) getPlayerWins(playerId) / games;
    }

    public int getTotalGames() {
        return totalGames.get();
    }

    public int getTotalBombsExploded() {
        return totalBombsExploded.get();
    }

    public Duration getUptime() {
        return Duration.between(startTime, Instant.now());
    }

    public void reset() {
        playerWins.clear();
        playerGamesPlayed.clear();
        playerBombsPlaced.clear();
        playerKills.clear();
        totalGames.set(0);
        totalBombsExploded.set(0);
        startTime = Instant.now();
        System.out.println("Statistics reset");
    }
}
