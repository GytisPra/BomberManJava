package Memento;

import java.time.LocalDateTime;

public class GameMemento {
    private byte[] encryptedState;
    private String checksum;
    private LocalDateTime createdAt;
    private String mementoId;

    GameMemento(byte[] encryptedState, String checksum, String mementoId) {}

    byte[] getEncryptedState() { return null; }
    String getChecksum() { return null; }
    String getMementoId() { return null; }
    public LocalDateTime getCreatedAt() { return null; }
}

