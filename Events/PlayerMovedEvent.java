package Events;

import java.time.LocalDateTime;

import Models.Player;

public class PlayerMovedEvent implements IGameEvent {
    public String RoomId = "";
    public Player Player = new Player();
    public LocalDateTime Timestamp = LocalDateTime.now();

    @Override
    public String getRoomId() {
        return RoomId;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return Timestamp;
    }

    @Override
    public void setRoomId(String roomId) {
        RoomId = roomId;
    }

    @Override
    public void setTimestamp(LocalDateTime timestamp) {
        Timestamp = timestamp;
    }

    public Player getPlayer() {
        return Player;
    }

    public void setPlayer(Player player) {
        Player = player;
    }
}