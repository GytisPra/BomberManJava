package Commands;

import java.util.concurrent.CompletableFuture;

import Services.IGameService;

public class MovePlayerCommand implements ICommand {
    private final IGameService gameService;
    private final String roomId;
    private final String playerId;
    private final int deltaX;
    private final int deltaY;

    public MovePlayerCommand(IGameService gameService, String roomId, String playerId, int deltaX, int deltaY) {
        this.gameService = gameService;
        this.roomId = roomId;
        this.playerId = playerId;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    @Override
    public CompletableFuture<CommandResult> executeAsync() {
        return gameService.movePlayerAsync(roomId, playerId, deltaX, deltaY)
                .thenApply(success -> {
                    CommandResult result = new CommandResult();
                    result.setSuccess(success);
                    return result;
                });
    }
}