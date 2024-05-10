package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public final Originator originator;
    private final List<Originator.Memento> history;

    public CareTaker() {
        this.originator = new Originator();
        this.history = new ArrayList<>();
    }

    public void save() {
        history.add(this.originator.createMemento());
    }

    public void undo() {
        int index = this.history.size();
        this.originator.setMemento(this.history.remove(index - 1));
    }
}