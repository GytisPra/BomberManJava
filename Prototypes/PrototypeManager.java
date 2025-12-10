package Prototypes;

import java.util.List;
import java.util.Map;
import Models.GameBoard;
import Models.Player;

public class PrototypeManager {
    private Map<String, PlayerPrototype> playerPrototypes;
    private Map<String, GameBoardPrototype> boardPrototypes;

    public void RegisterPlayerPrototype(String key, Player template) {}
    public void registerBoardPrototype(String key, GameBoard template) {}
    public Player createPlayerFromPrototype(String key) { return null; }
    public GameBoard createBoardFromPrototype(String key) { return null; }
    public Player createPlayerPreview(String key) { return null; }
    public GameBoard createBoardSnapshot(String key) { return null; }
    public List<Player> createAllPlayerPreviews() { return null; }
}
