package Singletons;

public final class GameConfiguration {
    private static GameConfiguration instance;

    private int maxPlayersPerRoom;
    private int bombExplosionTimeSeconds;
    private int explosionDurationSeconds;
    private double powerUpDropChance;
    private int defaultBombCount;
    private int defaultBombRange;
    private int defaultMovementSpeed;
    private int gameUpdateIntervalMs;
    private int boardWidth;
    private int boardHeight;
    private double destructibleWallChance;
    private String[] playerColors;
    private int[][] spawnPositions;

    private GameConfiguration() {}

    public static synchronized GameConfiguration getInstance() { return null; }

    public int getMaxPlayersPerRoom() { return 0; }
    public int getBombExplosionTimeSeconds() { return 0; }
    public int getExplosionDurationSeconds() { return 0; }
    public double getPowerUpDropChance() { return 0; }
    public int getDefaultBombCount() { return 0; }
    public int getDefaultBombRange() { return 0; }
    public int getDefaultMovementSpeed() { return 0; }
    public int getGameUpdateIntervalMs() { return 0; }
    public int getBoardWidth() { return 0; }
    public int getBoardHeight() { return 0; }
    public double getDestructibleWallChance() { return 0; }
    public String[] getPlayerColors() { return null; }
    public int[][] getSpawnPositions() { return null; }

    public void updateMaxPlayers(int maxPlayers) {}
    public void updateBombExplosionTime(int seconds) {}
    public void updatePowerUpDropChance(double chance) {}
    public void resetToDefaults() {}
    public String getPlayerColor(int playerIndex) { return null; }
    public int[] getSpawnPosition(int playerIndex) { return null; }
}
