package Facades;

import java.util.concurrent.CompletableFuture;

import Enums.PlayerAction;
import Enums.GameState;

import Models.GameRoom;

import Services.IGameService;

import Commands.ICommand;
import Commands.ICommandHandler;
import Commands.MovePlayerCommand;
import Commands.PlaceBombCommand;

import Factories.IGameFactory;
import Events.IEventPublisher;

public class GameFacade implements IGameFacade {

    private final IGameService gameService;
    private final ICommandHandler commandHandler;
    private final IGameFactory gameFactory;
    // private final IEventPublisher eventPublisher;

    public GameFacade(
            IGameService gameService,
            ICommandHandler commandHandler,
            IGameFactory gameFactory,
            IEventPublisher eventPublisher) {
        this.gameService = gameService;
        this.commandHandler = commandHandler;
        this.gameFactory = gameFactory;
        // this.eventPublisher = eventPublisher;
    }

    @Override
    public CompletableFuture<GameRoom> createAndJoinRoomAsync(String roomId, String playerId, String playerName) {
        GameRoom room = gameService.getRoom(roomId);
        if (room == null) {
            room = gameService.createRoom(roomId, "Classic");
        }
        final GameRoom finalRoom = room;
        var player = gameFactory.createPlayer(playerId, playerName);

        return gameService.joinRoomAsync(roomId, player)
                .thenApply(joined -> finalRoom);
    }

    @Override
    public CompletableFuture<Boolean> startGameSessionAsync(String roomId) {
        GameRoom room = gameService.getRoom(roomId);
        if (room == null || room.getPlayers().size() < 2) {
            return CompletableFuture.completedFuture(false);
        }

        return gameService.startGameAsync(roomId)
                .thenApply(v -> true);
    }

    @Override
    public CompletableFuture<Boolean> performPlayerActionAsync(String roomId, String playerId, PlayerAction action) {
        ICommand command;

        switch (action) {
            case MoveUp:
                command = new MovePlayerCommand(gameService, roomId, playerId, 0, -1);
                break;
            case MoveDown:
                command = new MovePlayerCommand(gameService, roomId, playerId, 0, 1);
                break;
            case MoveLeft:
                command = new MovePlayerCommand(gameService, roomId, playerId, -1, 0);
                break;
            case MoveRight:
                command = new MovePlayerCommand(gameService, roomId, playerId, 1, 0);
                break;
            case PlaceBomb:
                command = new PlaceBombCommand(gameService, roomId, playerId);
                break;
            default:
                throw new IllegalArgumentException("Invalid action");
        }

        return commandHandler.handleAsync(command)
                .thenApply(result -> result.isSuccess());
    }

    @Override
    public CompletableFuture<GameRoomStatus> getRoomStatusAsync(String roomId) {
        GameRoom room = gameService.getRoom(roomId);

        if (room == null) {
            GameRoomStatus emptyStatus = new GameRoomStatus();
            emptyStatus.setRoomId(roomId);
            return CompletableFuture.completedFuture(emptyStatus);
        }

        GameRoomStatus status = new GameRoomStatus();
        status.setRoomId(room.getId());
        status.setPlayerCount(room.getPlayers().size());
        status.setAlivePlayerCount((int) room.getPlayers().stream().filter(p -> p.isAlive()).count());
        status.setState(room.getState().toString());
        status.setCanStart(room.getPlayers().size() >= 2 && room.getState() == GameState.Waiting);
        status.setFinished(room.getState() == GameState.Finished);

        return CompletableFuture.completedFuture(status);
    }
}