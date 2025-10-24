package Prototypes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.GameBoard;
import Models.Player;

public class PrototypeManager
{
    private final Map<String, PlayerPrototype> playerPrototypes = new HashMap<>();
    private final Map<String, GameBoardPrototype> boardPrototypes = new HashMap<>();

    // -----------------------
    // Register
    // -----------------------
    public void RegisterPlayerPrototype(String key, Player template)
    {
        playerPrototypes.put(key, new PlayerPrototype(template));
    }

    public void registerBoardPrototype(String key, GameBoard template) {
        boardPrototypes.put(key, new GameBoardPrototype(template));
    }

    // -----------------------
    // Create deep clones
    // -----------------------
    public Player createPlayerFromPrototype(String key) {
        PlayerPrototype prototype = playerPrototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }

    public GameBoard createBoardFromPrototype(String key) {
        GameBoardPrototype prototype = boardPrototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }

    // -----------------------
    // Create shallow clones
    // -----------------------
    public Player createPlayerPreview(String key) {
        PlayerPrototype prototype = playerPrototypes.get(key);
        return (prototype != null) ? prototype.cloneShallow() : null;
    }

    public GameBoard createBoardSnapshot(String key) {
        GameBoardPrototype prototype = boardPrototypes.get(key);
        return (prototype != null) ? prototype.cloneShallow() : null;
    }

    // -----------------------
    // Create all player previews
    // -----------------------
    public List<Player> createAllPlayerPreviews() {
        return playerPrototypes.values().stream()
                .map(PlayerPrototype::cloneShallow)
                .collect(Collectors.toList());
    }
}