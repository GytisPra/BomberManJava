package Facades;

public class GameRoomStatus {
    private String roomId = "";
    private int playerCount;
    private int alivePlayerCount;
    private String state = "";
    private boolean canStart;
    private boolean isFinished;

    // --- Getters and Setters ---
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int getAlivePlayerCount() {
        return alivePlayerCount;
    }

    public void setAlivePlayerCount(int alivePlayerCount) {
        this.alivePlayerCount = alivePlayerCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isCanStart() {
        return canStart;
    }

    public void setCanStart(boolean canStart) {
        this.canStart = canStart;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}