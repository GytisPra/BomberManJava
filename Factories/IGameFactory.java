package Factories;

import Models.GameBoard;
import Models.GameRoom;
import Models.Player;

public interface IGameFactory
{
    GameRoom createGameRoom(String roomId);
    Player createPlayer(String id, String name);
    GameBoard createGameBoard();
}
