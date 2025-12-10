package Commands;

import java.util.concurrent.CompletableFuture;

public interface ICommandHandler {
    CompletableFuture<CommandResult> handleAsync(ICommand command);
}
