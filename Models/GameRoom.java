package Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Enums.GameState;
import States.*;

public class GameRoom {

    private String id = UUID.randomUUID().toString();
    private List<Player> players = new ArrayList<>();
    private GameState state = GameState.Waiting;
    private GameBoard board = new GameBoard();
    private LocalDateTime lastUpdate = LocalDateTime.now();
    private GameStateBase stateHandler = new WaitingState();

    // -----------------------
    // Getters and Setters
    // -----------------------
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public GameBoard getBoard() {
        return board;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public GameStateBase getStateHandler() {
        return stateHandler;
    }

    public void setStateHandler(GameStateBase stateHandler) {
        this.stateHandler = stateHandler;
    }

    // -----------------------
    // Methods
    // -----------------------

    public void updateStateHandler() {
        switch (state) {
            case Waiting:
                stateHandler = new WaitingState();
                break;
            case Playing:
                stateHandler = new PlayingState();
                break;
            case Finished:
                stateHandler = new FinishedState();
                break;
            default:
                stateHandler = new WaitingState();
        }
    }
}
