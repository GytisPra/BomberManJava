package Events;

import java.time.LocalDateTime;

import Models.Bomb;

public class BombPlacedEvent implements IGameEvent {
    public String RoomId = "";
    public Models.Bomb Bomb = new Bomb();
    public LocalDateTime Timestamp = LocalDateTime.now();

    public Bomb getBomb() {
        return Bomb;
    }

    public void setBomb(Bomb bomb) {
        Bomb = bomb;
    }

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
}