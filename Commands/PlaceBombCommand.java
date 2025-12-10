package Commands;

import java.util.concurrent.CompletableFuture;
import Services.IGameService;
import Models.Bomb;

public class PlaceBombCommand implements ICommand {
    private IGameService gameService;
    private String roomId;
    private String playerId;
    private Bomb placedBomb;

    public PlaceBombCommand(IGameService gameService, String roomId, String playerId) {}

    public CompletableFuture<CommandResult> executeAsync() { return null; }
    public CompletableFuture<CommandResult> undoAsync() { return null; }
}
