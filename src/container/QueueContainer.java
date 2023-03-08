package container;

import domain.Task;

import java.util.ArrayList;
import java.util.List;

public class QueueContainer extends AbstractContainer implements Container{
    public QueueContainer(){
        this.elems = new ArrayList<>();
    }
    @Override
    public Task remove() {
        return elems.remove(0);
    }

}
