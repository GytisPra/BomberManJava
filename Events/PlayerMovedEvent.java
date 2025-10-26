package Events;

import java.time.LocalDateTime;

import Models.Player;

public class PlayerMovedEvent implements IGameEvent
{
    public String RoomId  = "";
    public Player Player = new Player();
    public LocalDateTime Timestamp  = LocalDateTime.now();

    @Override
    public LocalDateTime getTimestamp() {
        return Timestamp;
    }

    @Override
    public String getRoomId() { 
        return RoomId;
    }
}