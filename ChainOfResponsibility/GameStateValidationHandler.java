package ChainOfResponsibility;

import Commands.ICommand;
import Models.GameRoom;
import Models.Player;

public class GameStateValidationHandler extends CommandValidationHandler {
    public ValidationResult handle(ICommand command, GameRoom room, Player player) { return null; }
}

