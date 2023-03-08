package container;

import domain.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer extends AbstractContainer implements Container{

    public StackContainer() {
        this.elems= new ArrayList<>();
    }

    @Override
    public Task remove() {
        int pos = this.elems.size()-1;
        return (Task)this.elems.remove(pos);
    }

}
