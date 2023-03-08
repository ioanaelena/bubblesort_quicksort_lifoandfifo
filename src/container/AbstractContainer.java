package container;

import domain.Task;

import java.util.List;

public abstract class AbstractContainer {
    List<Task>elems;

    public void add(Task task){
        elems.add(task);
    }
    public int size(){
        return elems.size();
    }
    public boolean isEmpty(){
        return elems.isEmpty();
    }
}
