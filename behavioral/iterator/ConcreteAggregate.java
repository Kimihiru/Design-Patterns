package behavioral.iterator;

public class ConcreteAggregate implements Aggregate{
    private final int[] list;
    public ConcreteAggregate(int[] list){
        this.list=list;
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size() {
        return list.length;
    }

    public int at(int index) {
        return list[index];
    }
}