package Services;

import Models.GameRoom;
import Models.Player;
import Bridges.IGameRenderer;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IGameService {
    GameRoom createRoom(String roomId, String theme);
    GameRoom getRoom(String roomId);
    List<GameRoom> getRooms();
    CompletableFuture<Boolean> joinRoomAsync(String roomId, Player player);
    CompletableFuture<Void> startGameAsync(String roomId);
    CompletableFuture<Boolean> movePlayerAsync(String roomId, String playerId, int deltaX, int deltaY);
    CompletableFuture<Boolean> placeBombAsync(String roomId, String playerId);
    void setRoomBombFactory(String roomId, String factoryType);
    String getRoomBombFactoryType(String roomId);
    void setRoomTheme(String roomId, String theme);
    String getRoomTheme(String roomId);
    IGameRenderer getRoomRenderer(String roomId);
    List<Player> getPlayerRolePreviews();
    void setRoomRenderer(String roomId, IGameRenderer renderer);
}
