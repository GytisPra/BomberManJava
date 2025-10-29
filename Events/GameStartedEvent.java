package Events;

import java.time.LocalDateTime;

public class GameStartedEvent implements IGameEvent
{
    public String RoomId = "";
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
    };
}