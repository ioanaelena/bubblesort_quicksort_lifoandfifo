

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import container.Strategy;
import domain.Bubblesorter;
import domain.MessageTask;
import domain.Quicksorter;
import domain.SortingTask;
import runner.StrategyTaskRunner;
import runner.TaskRunner;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        MessageTask messageTask = new MessageTask(1L, "De viata", "Andy", "Ioana", LocalDateTime.now());
        MessageTask messageTask1 = new MessageTask(2L, "De viata", "Andy", "Ioana", LocalDateTime.now());
        MessageTask messageTask2 = new MessageTask(3L, "De viata", "Andy", "Ioana", LocalDateTime.now());
        MessageTask messageTask3 = new MessageTask(4L, "De viata", "Andy", "Ioana", LocalDateTime.now());
        MessageTask messageTask4 = new MessageTask(5L, "De viata", "Andy", "Ioana", LocalDateTime.now());
        TaskRunner runner =  new StrategyTaskRunner(Strategy.FIFO);
        TaskRunner runner1 = new StrategyTaskRunner(Strategy.LIFO);
        runner.addTask(messageTask);
        runner.addTask(messageTask1);
        runner.addTask(messageTask2);
        runner.addTask(messageTask3);
        runner.addTask(messageTask4);
        runner.executeAll();
        int [] vector={10,6,3,12,24,13,48};
        Bubblesorter bubblesorter=new Bubblesorter(vector);
        Quicksorter quicksorter=new Quicksorter(vector);
        SortingTask sortingTask=new SortingTask(1L,"sorteaza un vector de inturi",quicksorter);
        sortingTask.execute();
        for(int i=0;i<vector.length;i++)
            System.out.println(vector[i]);
    }
}