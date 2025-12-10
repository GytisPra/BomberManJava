package Singletons;

public final class GameStatistics {
    private static GameStatistics instance;

    private int totalGamesPlayed;
    private int totalBombsPlaced;
    private int totalPlayersKilled;
    private int totalPowerUpsCollected;

    private GameStatistics() {}

    public static synchronized GameStatistics getInstance() { return null; }

    public void incrementGamesPlayed() {}
    public void incrementBombsPlaced() {}
    public void incrementPlayersKilled() {}
    public void incrementPowerUpsCollected() {}

    public int getTotalGamesPlayed() { return 0; }
    public int getTotalBombsPlaced() { return 0; }
    public int getTotalPlayersKilled() { return 0; }
    public int getTotalPowerUpsCollected() { return 0; }

    public void resetStatistics() {}
    public String getStatisticsReport() { return null; }
}
