package Singletons;

public final class GameConfiguration {
    private static GameConfiguration instance;

    private int maxPlayersPerRoom = 4;
    private int bombExplosionTimeSeconds = 3;
    private int explosionDurationSeconds = 1;
    private double powerUpDropChance = 0.3;
    private int defaultBombCount = 1;
    private int defaultBombRange = 2;
    private int defaultMovementSpeed = 1;
    private int gameUpdateIntervalMs = 100;
    private int boardWidth = 15;
    private int boardHeight = 13;
    private double destructibleWallChance = 0.6;

    private final String[] playerColors = { "#ff0000", "#0000ff", "#00ff00", "#ffff00" };
    private final int[][] spawnPositions = { {1, 1}, {13, 1}, {1, 11}, {13, 11} };

    private GameConfiguration() {}

    public static synchronized GameConfiguration getInstance() {
        if (instance == null) {
            instance = new GameConfiguration();
        }
        return instance;
    }

    public int getMaxPlayersPerRoom() { return maxPlayersPerRoom; }
    public int getBombExplosionTimeSeconds() { return bombExplosionTimeSeconds; }
    public int getExplosionDurationSeconds() { return explosionDurationSeconds; }
    public double getPowerUpDropChance() { return powerUpDropChance; }
    public int getDefaultBombCount() { return defaultBombCount; }
    public int getDefaultBombRange() { return defaultBombRange; }
    public int getDefaultMovementSpeed() { return defaultMovementSpeed; }
    public int getGameUpdateIntervalMs() { return gameUpdateIntervalMs; }
    public int getBoardWidth() { return boardWidth; }
    public int getBoardHeight() { return boardHeight; }
    public double getDestructibleWallChance() { return destructibleWallChance; }
    public String[] getPlayerColors() { return playerColors; }
    public int[][] getSpawnPositions() { return spawnPositions; }

    public void updateMaxPlayers(int maxPlayers) {
        if (maxPlayers < 2 || maxPlayers > 8)
            throw new IllegalArgumentException("Max players must be between 2 and 8");

        this.maxPlayersPerRoom = maxPlayers;
        System.out.println("Max players updated to " + maxPlayers);
    }

    public void updateBombExplosionTime(int seconds) {
        if (seconds < 1 || seconds > 10)
            throw new IllegalArgumentException("Bomb explosion time must be between 1 and 10 seconds");

        this.bombExplosionTimeSeconds = seconds;
        System.out.println("Bomb explosion time updated to " + seconds + "s");
    }

    public void updatePowerUpDropChance(double chance) {
        if (chance < 0 || chance > 1)
            throw new IllegalArgumentException("Drop chance must be between 0 and 1");

        this.powerUpDropChance = chance;
        System.out.printf("Power-up drop chance updated to %.0f%%%n", chance * 100);
    }

    public void resetToDefaults() {
        maxPlayersPerRoom = 4;
        bombExplosionTimeSeconds = 3;
        explosionDurationSeconds = 1;
        powerUpDropChance = 0.3;
        defaultBombCount = 1;
        defaultBombRange = 2;
        defaultMovementSpeed = 1;
        gameUpdateIntervalMs = 100;
        boardWidth = 15;
        boardHeight = 13;
        destructibleWallChance = 0.6;

        System.out.println("Configuration reset to defaults");
    }

    public String getPlayerColor(int playerIndex) {
        if (playerIndex < 0 || playerIndex >= playerColors.length)
            return "#ffffff";
        return playerColors[playerIndex];
    }

    public int[] getSpawnPosition(int playerIndex) {
        if (playerIndex < 0 || playerIndex >= spawnPositions.length)
            return new int[] {1, 1};
        return spawnPositions[playerIndex];
    }
}
