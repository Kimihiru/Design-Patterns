package behavioral.observer;

public interface Observer {
    int getState();
    void update(Subject subject);
}