package Events;

import java.time.LocalDateTime;

public class GameStartedEvent implements IGameEvent
{
    public String roomId = "";
    public LocalDateTime timestamp = LocalDateTime.now();

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String getRoomId() {
        return roomId;
    }
}