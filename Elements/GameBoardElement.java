package Elements;

import Bridges.IGameRenderer;
import Models.GameBoard;

public class GameBoardElement extends GameElement
{
    private final GameBoard board;

    public GameBoardElement(GameBoard board, IGameRenderer renderer)
    {
        super(renderer);
        this.board = board;
    }

    @Override
    public String render()
    {
        return renderer.renderGameBoard(board);
    }
}