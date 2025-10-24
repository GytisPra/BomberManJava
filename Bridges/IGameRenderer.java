package Bridges;

import Models.*;

public interface IGameRenderer
{
    String renderPlayer(Player player);
    String renderBomb(Bomb bomb);
    String renderExplosion(Explosion explosion);
    String renderPowerUp(PowerUp powerUp);
    String renderGameBoard(GameBoard board);
}
