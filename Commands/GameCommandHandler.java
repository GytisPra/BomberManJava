package Commands;

import java.util.concurrent.CompletableFuture;

public class GameCommandHandler implements ICommandHandler
{
    @Override
    public CompletableFuture<CommandResult> handleAsync(ICommand command) {
        return command.executeAsync();
    }

}