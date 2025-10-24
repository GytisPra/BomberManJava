package Elements;

import Bridges.IGameRenderer;
import Models.Bomb;

public class BombElement extends GameElement
{
    private final Bomb bomb;

    public BombElement(Bomb bomb, IGameRenderer renderer)
    {
        super(renderer);
        this.bomb = bomb;
    }

    @Override
    public String render()
    {
        return renderer.renderBomb(bomb);
    }
}