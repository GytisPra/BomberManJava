package States;

import Enums.GameState;
import Models.GameRoom;

public interface GameStateBase {
    Boolean canJoinPlayer(GameRoom room);
    Boolean canStartGame(GameRoom room);
    Boolean canMovePlayer(GameRoom room);
    Boolean canPlaceBomb(GameRoom room);
    GameState getStateType();
}
