package behavioral.memento;

public class Originator {
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * Memento
     * stores internal state of the Originator object and protects
     * against access by objects other than the originator
     */
    public class Memento  {
        private int state;

        private Memento(int state) {
            this.state = state;
        }

        private void setState(int state) {
            this.state = state;
        }

        private int getState() {
            return state;
        }
    }
}