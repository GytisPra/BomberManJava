package Elements;

import Bridges.IGameRenderer;
import Models.Explosion;

public class ExplosionElement extends GameElement
{
    private final Explosion explosion;

    public ExplosionElement(Explosion explosion, IGameRenderer renderer)
    {
        super(renderer);
        this.explosion = explosion;
    }

    @Override
    public String render()
    {
        return renderer.renderExplosion(explosion);
    }
}