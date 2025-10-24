package Elements;

import Bridges.IGameRenderer;
import Models.Player;

public class PlayerElement extends GameElement {
    private final Player player;

    public PlayerElement(Player player, IGameRenderer renderer) {
        super(renderer);
        this.player = player;
    }

    @Override
    public String render() {
        return renderer.renderPlayer(player);
    }
}
