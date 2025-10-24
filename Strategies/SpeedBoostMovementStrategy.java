package Strategies;

import Enums.CellType;
import Models.GameBoard;

public class SpeedBoostMovementStrategy implements IPlayerMovementStrategy
{
    private final int BASE_MOVEMENT_COOLDOWN_MS = 150;

    @Override
    public Boolean canMove(GameBoard board, int x, int y)
    {
        if (x < 0 || x >= GameBoard.Width || y < 0 || y >= GameBoard.Height)
            return false;

        var cellType = CellType.values()[board.getGrid()[y][x]];
        if (cellType == CellType.Wall || cellType == CellType.DestructibleWall)
            return false;

        return board.getBombs().stream().noneMatch(b -> b.getX() == x && b.getY() == y);
    }

    @Override
    public Boolean canMoveNow(String playerId)
    {
        return MovementCooldownTracker.canMoveNow(playerId, BASE_MOVEMENT_COOLDOWN_MS);
    }

    @Override
    public int getBaseMovementCooldownMs() {
        return BASE_MOVEMENT_COOLDOWN_MS;
    } 
}