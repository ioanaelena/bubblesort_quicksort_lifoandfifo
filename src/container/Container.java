package container;

import domain.Task;

public interface Container {
    Task remove();

    void add(Task var1);

    int size();

    boolean isEmpty();
}
