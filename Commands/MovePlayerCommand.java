package Commands;

import java.util.concurrent.CompletableFuture;
import Services.IGameService;

public class MovePlayerCommand implements ICommand {
    private IGameService gameService;
    private String roomId;
    private String playerId;
    private int deltaX;
    private int deltaY;
    private Integer previousX;
    private Integer previousY;

    public MovePlayerCommand(IGameService gameService, String roomId, String playerId, int deltaX, int deltaY) {}

    public CompletableFuture<CommandResult> executeAsync() { return null; }
    public CompletableFuture<CommandResult> undoAsync() { return null; }
}
