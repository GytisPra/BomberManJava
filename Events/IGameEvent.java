package Events;

import java.time.LocalDateTime;

public interface IGameEvent
{
    public static String roomId = "";
    public static LocalDateTime timestamp = null;

    LocalDateTime getTimestamp();
    String getRoomId();
}