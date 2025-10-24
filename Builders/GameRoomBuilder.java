package Builders;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Enums.GameState;
import Models.GameBoard;
import Models.GameRoom;
import Models.Player;

public class GameRoomBuilder implements IGameRoomBuilder
{
    private String id = UUID.randomUUID().toString();
    private GameState state = GameState.Waiting;
    private GameBoard board = new GameBoard();
    private final List<Player> players = new ArrayList<>();

    @Override
    public IGameRoomBuilder withId(String id)
    {
        this.id = id;
        return this;
    }

    @Override
    public IGameRoomBuilder withState(GameState state)
    {
        this.state = state;
        return this;
    }

    @Override
    public IGameRoomBuilder withBoard(GameBoard board)
    {
        this.board = board;
        return this;
    }

    @Override
    public IGameRoomBuilder addPlayer(Player player)
    {
        this.players.add(player);
        return this;
    }

    @Override
    public GameRoom build()
    {
        List<Player> playersCopy = new ArrayList<>(players);

        var room = new GameRoom();

        room.setId(id);
        room.setState(state);
        room.setBoard(board);
        room.setPlayers(playersCopy);
        room.setLastUpdate(java.time.LocalDateTime.now());

        room.updateStateHandler();

        id= UUID.randomUUID().toString();
        state = GameState.Waiting;
        board = new GameBoard();
        players.clear();

        return room;
    }
}
