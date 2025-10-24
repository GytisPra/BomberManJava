package Elements;

import Bridges.IGameRenderer;
import Models.PowerUp;

public class PowerUpElement extends GameElement
{
    private final PowerUp powerUp;

    public PowerUpElement(PowerUp powerUp, IGameRenderer renderer)
    {
        super(renderer);
        this.powerUp = powerUp;
    }

    @Override
    public String render()
    {
        return renderer.renderPowerUp(powerUp);
    }
}