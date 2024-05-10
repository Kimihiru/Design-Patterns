package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> children;

    public Composite() {
        this.children = new ArrayList<Component>();
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(int index) {
        this.children.remove(index);
    }

    @Override
    public void operation() {
        for (int i = 0; i < this.children.size(); i++) {
            this.children.get(i).operation();
        }
    }
}