package Builders;

import Models.GameRoom;
import Models.GameBoard;
import Enums.GameState;

public class GameRoomBuilder implements IGameRoomBuilder {
    private GameRoom room;

    public GameRoomBuilder() {}

    public IGameRoomBuilder withId(String id) { return null; }
    public IGameRoomBuilder withState(GameState state) { return null; }
    public IGameRoomBuilder withBoard(GameBoard board) { return null; }
    public GameRoom build() { return null; }
}
