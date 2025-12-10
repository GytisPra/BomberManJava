package ChainOfResponsibility;

import Commands.ICommand;
import Models.GameRoom;
import Models.Player;

public class RoomValidationHandler extends CommandValidationHandler {
    public ValidationResult handle(ICommand command, GameRoom room, Player player) { return null; }
}

