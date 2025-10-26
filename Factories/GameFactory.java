package Factories;

import Models.GameBoard;
import Models.GameRoom;
import Models.Player;

public class GameFactory implements IGameFactory
{
    @Override
    public GameRoom createGameRoom(String roomId)
    {
        var gameRoom = new GameRoom();
        gameRoom.setId(roomId);

        return gameRoom;
    }

    @Override
    public Player createPlayer(String id, String name)
    {
        var player = new Player();
        player.setId(id);
        player.setName(name);

        return player;
    }

    @Override
    public GameBoard createGameBoard()
    {
        return new GameBoard();
    }
}