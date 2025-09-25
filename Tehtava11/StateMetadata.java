package Tehtava11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StateMetadata {
    private final IMemento memento;
    private final LocalDateTime timestamp;

    public StateMetadata(IMemento memento) {
        this.memento = memento;
        this.timestamp = LocalDateTime.now();
    }

    public IMemento getMemento() {
        return memento;
    }

    @Override
    public String toString() {
        return "Guardado a las " + timestamp.format(DateTimeFormatter.ofPattern("HH:mm:ss"));




    }
}
