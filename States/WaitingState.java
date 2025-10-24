package States;

import Enums.GameState;
import Models.GameRoom;

public class WaitingState implements GameStateBase {
    @Override
    public Boolean canJoinPlayer(GameRoom room) {
        return room.getPlayers().size() < 4;
    }

    @Override
    public Boolean canStartGame(GameRoom room) {
        return room.getPlayers().size() >= 2;
    }

    @Override
    public Boolean canMovePlayer(GameRoom room) {
        return false;
    }

    @Override
    public Boolean canPlaceBomb(GameRoom room) {
        return false;
    }

    @Override
    public GameState getStateType() {
        return GameState.Waiting;
    }
}