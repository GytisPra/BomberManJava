package Models;

import java.time.LocalDateTime;
import java.util.List;
import Enums.GameState;
import States.*;

public class GameRoom {

    private String id;
    private List<Player> players;
    private GameState state;
    private GameBoard board;
    private LocalDateTime lastUpdate;
    private GameStateBase stateHandler;

    public String getId() { return null; }
    public void setId(String id) {}
    public List<Player> getPlayers() { return null; }
    public void setPlayers(List<Player> players) {}
    public GameState getState() { return null; }
    public void setState(GameState state) {}
    public GameBoard getBoard() { return null; }
    public void setBoard(GameBoard board) {}
    public LocalDateTime getLastUpdate() { return null; }
    public void setLastUpdate(LocalDateTime lastUpdate) {}
    public GameStateBase getStateHandler() { return null; }
    public void setStateHandler(GameStateBase stateHandler) {}

    public void updateStateHandler() {}
}
