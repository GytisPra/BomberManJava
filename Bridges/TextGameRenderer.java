package Bridges;

import Models.*;

public class TextGameRenderer implements IGameRenderer {

    @Override
    public String renderPlayer(Player player) {
        String status = player.isAlive() ? "Alive" : "Dead";
        String color = player.getColor();
        return String.format("Player %s [%s] at (%d,%d) - %s",
                player.getName(), color, player.getX(), player.getY(), status);
    }

    @Override
    public String renderBomb(Bomb bomb) {
        return String.format("Bomb at (%d,%d) Range:%d",
                bomb.getX(), bomb.getY(), bomb.getRange());
    }

    @Override
    public String renderExplosion(Explosion explosion) {
        return String.format("Explosion at (%d,%d)",
                explosion.getX(), explosion.getY());
    }

    @Override
    public String renderPowerUp(PowerUp powerUp) {
        String icon;

        switch (powerUp.getType()) {
            case BombUp:  
                icon = "Bomb";
                break;
            case RangeUp:
                icon = "Range";
                break;
            case SpeedUp:
                icon = "Speed";
                break;
            default:
                icon = "?";
                break;
        }

        return String.format("%s PowerUp %s at (%d,%d)",
                icon, powerUp.getType(), powerUp.getX(), powerUp.getY());
    }

    @Override
    public String renderGameBoard(GameBoard board) {
        StringBuilder result = new StringBuilder();
        result.append("╔══════════════════════════╗\n");
        result.append(String.format("║  Board %dx%d            ║\n",
                GameBoard.Width, GameBoard.Height));
        result.append("╠══════════════════════════╣\n");
        result.append(String.format("║  Bombs: %-3d            ║\n", board.getBombs().size()));
        result.append(String.format("║  Explosions: %-3d       ║\n", board.getExplosions().size()));
        result.append(String.format("║  PowerUps: %-3d         ║\n", board.getPowerUps().size()));
        result.append("╚══════════════════════════╝");
        return result.toString();
    }
}