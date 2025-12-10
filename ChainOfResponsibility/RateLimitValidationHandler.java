package ChainOfResponsibility;

import Commands.ICommand;
import Models.GameRoom;
import Models.Player;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.Duration;

public class RateLimitValidationHandler extends CommandValidationHandler {
    private Map<String, LocalDateTime> lastCommandTimes;
    private Duration minCommandInterval;

    public ValidationResult handle(ICommand command, GameRoom room, Player player) { return null; }
}

