package Events;

import java.time.LocalDateTime;

import Models.Bomb;

public class BombPlacedEvent implements IGameEvent
{
    public String roomId  = "";
    public Bomb bomb = new Bomb();
    public LocalDateTime timestamp = LocalDateTime.now();

    // --- Getters and Setters ---
    @Override
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Bomb getBomb() {
        return bomb;
    }

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}