package States;

import Enums.GameState;
import Models.GameRoom;

public abstract interface GameStateBase
{
    public abstract Boolean canJoinPlayer(GameRoom room);
    public abstract Boolean canStartGame(GameRoom room);
    public abstract Boolean canMovePlayer(GameRoom room);
    public abstract Boolean canPlaceBomb(GameRoom room);
    public abstract GameState getStateType();
}