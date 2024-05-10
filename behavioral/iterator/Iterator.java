package behavioral.iterator;

public interface Iterator {
    void first();
    void next();
    boolean isDone();
    int currentItem();
}