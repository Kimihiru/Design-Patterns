package structural.composite;

public class Leaf extends Component{
    private int id;
    Leaf(int index){
        this.id=index;
    }
    @Override
    public void operation() {
        System.out.println("Leaf " + this.id + " operation.");
    }
}