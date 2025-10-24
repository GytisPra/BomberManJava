package States;

import Enums.GameState;
import Models.GameRoom;

public class PlayingState implements GameStateBase {
    @Override
    public Boolean canJoinPlayer(GameRoom room) {
        return false;
    }

    @Override
    public Boolean canStartGame(GameRoom room) {
        return false;
    }

    @Override
    public Boolean canMovePlayer(GameRoom room) {
        return true;
    }

    @Override
    public Boolean canPlaceBomb(GameRoom room) {
        return true;
    }

    @Override
    public GameState getStateType() {
        return GameState.Playing;
    }
}