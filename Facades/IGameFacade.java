package Facades;

import java.util.concurrent.CompletableFuture;

import Enums.PlayerAction;
import Models.GameRoom;

public interface IGameFacade {
    CompletableFuture<GameRoom> createAndJoinRoomAsync(String roomId, String playerId, String playerName);
    CompletableFuture<Boolean> startGameSessionAsync(String roomId);
    CompletableFuture<Boolean> performPlayerActionAsync(String roomId, String playerId, PlayerAction action);
    CompletableFuture<GameRoomStatus> getRoomStatusAsync(String roomId);
}
