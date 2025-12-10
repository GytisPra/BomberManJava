package Strategies;

import Models.GameBoard;

public class SpeedBoostMovementStrategy implements IPlayerMovementStrategy {
    public Boolean canMove(GameBoard board, int x, int y) { return null; }
    public Boolean canMoveNow(String playerId) { return null; }
    public int getBaseMovementCooldownMs() { return 0; }
}
