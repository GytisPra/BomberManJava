package Adapters;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GameRoomData {
    private String roomId = "";
    private List<PlayerData> players = new ArrayList<>();
    private String state = "";
    private LocalDateTime lastUpdate;

    public String getRoomId() { return roomId; }
    public void setRoomId(String roomId) { this.roomId = roomId; }

    public List<PlayerData> getPlayers() { return players; }
    public void setPlayers(List<PlayerData> players) { this.players = players; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public LocalDateTime getLastUpdate() { return lastUpdate; }
    public void setLastUpdate(LocalDateTime lastUpdate) { this.lastUpdate = lastUpdate; }
}
