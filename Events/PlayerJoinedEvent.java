package Events;

import java.time.LocalDateTime;
import Models.Player;

public class PlayerJoinedEvent implements IGameEvent
{
    public String RoomId  = "";
    public Player Player = new Player();
    public LocalDateTime timestamp = LocalDateTime.now();


    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String getRoomId() {
        return RoomId;
    }

    public Player getPlayer() {
        return Player;
    }
}