package States;

import Enums.GameState;
import Models.GameRoom;

public class WaitingState implements GameStateBase {
    public Boolean canJoinPlayer(GameRoom room) { return null; }
    public Boolean canStartGame(GameRoom room) { return null; }
    public Boolean canMovePlayer(GameRoom room) { return null; }
    public Boolean canPlaceBomb(GameRoom room) { return null; }
    public GameState getStateType() { return null; }
}
