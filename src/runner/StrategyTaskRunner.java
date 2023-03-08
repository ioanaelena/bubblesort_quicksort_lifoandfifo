package runner;

import container.Container;
import container.Strategy;
import domain.Task;
import factory.TaskContainerFactory;

public class StrategyTaskRunner implements TaskRunner{
    Container container;

    public StrategyTaskRunner(Strategy strategy){
        container = TaskContainerFactory.getInstance().createContainer(strategy);
    }
    public void executeOneTask(){
        if(this.hasTask()){
            container.remove().execute();
        }
    }

    public void executeAll(){
        while(hasTask()){
            executeOneTask();
        }
    }

    public void addTask(Task t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        return !container.isEmpty();
    }
}
