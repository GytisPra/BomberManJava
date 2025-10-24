package Builders;

import Enums.GameState;
import Models.GameBoard;
import Models.GameRoom;
import Models.Player;

public interface IGameRoomBuilder
{
    IGameRoomBuilder withId(String id);
    IGameRoomBuilder withState(GameState state);
    IGameRoomBuilder withBoard(GameBoard board);
    IGameRoomBuilder addPlayer(Player player);
    GameRoom build();
}