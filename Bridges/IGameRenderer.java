package Bridges;

import Models.*;

public interface IGameRenderer {
    String renderBoard(GameBoard board);
    String renderPlayer(Player player);
    String renderBomb(Bomb bomb);
    String renderPowerUp(PowerUp powerUp);
    String renderExplosion(Explosion explosion);
}
