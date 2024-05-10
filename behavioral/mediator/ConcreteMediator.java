package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Colleague> colleagues = new ArrayList<>();
    @Override
    public void add(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void distribute(Colleague sender, String msg) {
        for (int i=0;i<this.colleagues.size();i++){
            if (this.colleagues.get(i).getID() != sender.getID()){
                this.colleagues.get(i).receive(msg);
            }
        }
    }
}