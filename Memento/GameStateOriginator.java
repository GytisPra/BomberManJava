package Memento;

import Models.GameRoom;

public class GameStateOriginator {
    private String encryptionKey;
    private GameRoom gameRoom;

    public GameStateOriginator(String encryptionKey) {}

    public void setGameRoom(GameRoom room) {}
    public GameMemento createMemento() { return null; }
    public void restoreFromMemento(GameMemento memento) {}
    public GameRoom getGameRoom() { return null; }

    private String serializeGameRoom(GameRoom room) { return null; }
    private GameRoom deserializeGameRoom(String json) { return null; }
    private byte[] encryptState(byte[] data) { return null; }
    private byte[] decryptState(byte[] encryptedData) { return null; }
    private String calculateChecksum(byte[] data) { return null; }
}

