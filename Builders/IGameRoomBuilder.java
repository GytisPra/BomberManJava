package Builders;

import Models.GameRoom;
import Models.GameBoard;
import Enums.GameState;

public interface IGameRoomBuilder {
    IGameRoomBuilder withId(String id);
    IGameRoomBuilder withState(GameState state);
    IGameRoomBuilder withBoard(GameBoard board);
    GameRoom build();
}
