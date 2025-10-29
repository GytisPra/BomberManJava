package Events;

import java.time.LocalDateTime;

public interface IGameEvent
{
    String RoomId = "";
    LocalDateTime Timestamp = null;

    public String getRoomId();

    public LocalDateTime getTimestamp();

    public void setRoomId(String roomId);

    public void setTimestamp(LocalDateTime timestamp);
}