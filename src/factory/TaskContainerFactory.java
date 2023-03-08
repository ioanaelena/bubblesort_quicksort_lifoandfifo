package factory;

import container.Container;
import container.QueueContainer;
import container.StackContainer;
import container.Strategy;

public class TaskContainerFactory implements Factory {
    private static TaskContainerFactory instance = null;//adresa factory

    @Override
    public Container createContainer(Strategy var1) {
        if (var1 == Strategy.LIFO)
            return new StackContainer();
        if (var1 == Strategy.FIFO)
            return new QueueContainer();
        return null;
    }

    private TaskContainerFactory(){

    }

    public static TaskContainerFactory getInstance() {
        if (instance == null)///vertifica daca fabrica exista , daca nu creaza una, altfel returneaza adresa
            instance = new TaskContainerFactory();
        return instance;
    }
}
