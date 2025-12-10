package Factories;

import Models.*;

public interface IGameFactory {
    GameRoom createGameRoom(String roomId);
    Player createPlayer(String playerId, String playerName);
    GameBoard createGameBoard();
}
