package Commands;

import java.util.concurrent.CompletableFuture;

import Services.IGameService;

public class PlaceBombCommand implements ICommand {
    private final IGameService gameService;
    private final String roomId;
    private final String playerId;

    public PlaceBombCommand(IGameService gameService, String roomId, String playerId) {
        this.gameService = gameService;
        this.roomId = roomId;
        this.playerId = playerId;
    }

    @Override
    public CompletableFuture<CommandResult> executeAsync() {
        return gameService.placeBombAsync(roomId, playerId).thenApply(
                success -> {
                    CommandResult result = new CommandResult();
                    result.setSuccess(success);
                    return result;
                });
    }
}