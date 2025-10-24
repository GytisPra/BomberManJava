package Elements;

import Bridges.IGameRenderer;

public abstract class GameElement {
    protected IGameRenderer renderer;

    protected GameElement(IGameRenderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(IGameRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract String render();
}