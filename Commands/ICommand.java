package Commands;

import java.util.concurrent.CompletableFuture;

public interface ICommand {
    CompletableFuture<CommandResult> executeAsync();
    CompletableFuture<CommandResult> undoAsync();
}
