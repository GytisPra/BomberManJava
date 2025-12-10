package ChainOfResponsibility;

import Commands.ICommand;
import Models.GameRoom;
import Models.Player;

public abstract class CommandValidationHandler {
    protected CommandValidationHandler nextHandler;

    public CommandValidationHandler setNext(CommandValidationHandler handler) { return null; }
    public abstract ValidationResult handle(ICommand command, GameRoom room, Player player);
}

