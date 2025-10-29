package Observers;

import Singletons.GameLogger;
import Events.*;

public class GameEventLoggerObserver implements IGameObserver {
    private final GameLogger logger;

    public GameEventLoggerObserver(GameLogger logger) {
        this.logger = logger;
    }

    @Override
    public void onGameEvent(IGameEvent gameEvent) {
        if (gameEvent instanceof PlayerJoinedEvent) {
            PlayerJoinedEvent pje = (PlayerJoinedEvent) gameEvent;
            logger.logInfo("Room",
                    String.format("Player %s joined room %s", pje.getPlayer().getName(), pje.getRoomId()));
            System.out.println(String.format("Player %s joined room %s", pje.getPlayer().getName(), pje.getRoomId()));

        } else if (gameEvent instanceof PlayerMovedEvent) {
            PlayerMovedEvent pme = (PlayerMovedEvent) gameEvent;
            logger.logDebug("Player", String.format("Player %s moved to (%d, %d)",
                    pme.getPlayer().getName(), pme.getPlayer().getX(), pme.getPlayer().getY()));

        } else if (gameEvent instanceof GameStartedEvent) {
            GameStartedEvent gse = (GameStartedEvent) gameEvent;
            logger.logInfo("Game", String.format("Game started in room %s", gse.getRoomId()));
            System.out.println(String.format("Game started in room %s", gse.getRoomId()));

        } else if (gameEvent instanceof BombPlacedEvent) {
            BombPlacedEvent bpe = (BombPlacedEvent) gameEvent;
            logger.logDebug("Bomb", String.format("Bomb placed at (%d, %d) by player %s",
                    bpe.getBomb().getX(), bpe.getBomb().getY(), bpe.getBomb().getPlayerId()));

        } else if (gameEvent instanceof BombExplodedEvent) {
            BombExplodedEvent bee = (BombExplodedEvent) gameEvent;
            logger.logInfo("Explosion", String.format("Bomb exploded in room %s creating %d explosions",
                    bee.getRoomId(), bee.getExplosions().size()));
            System.out.println(String.format("Bomb exploded in room %s creating %d explosions",
                    bee.getRoomId(), bee.getExplosions().size()));
        }
    }

}
