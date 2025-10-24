package Strategies;

import Models.GameBoard;

public interface IPlayerMovementStrategy
{
    Boolean canMove(GameBoard board, int x, int y);
    Boolean canMoveNow(String playerId);
    int getBaseMovementCooldownMs();
}
