package runner;

import domain.Task;

public interface TaskRunner {
    void executeOneTask();

    void executeAll();

    void addTask(Task var1);

    boolean hasTask();
}
