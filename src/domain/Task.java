package domain;

import java.util.Objects;

public abstract class Task {
    private Long taskID;
    private String description;

    public Long getTaskID() {
        return taskID;
    }

    public void setTaskID(Long taskID) {
        this.taskID = taskID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task(Long taskID, String description) {
        this.taskID = taskID;
        this.description = description;
    }
    public String toString(){return "ID-ul"+this.taskID + "description: "+this.description;}

    public abstract void execute();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Task)) {
            return false;
        }
        Task task = (Task) obj;
        return Objects.equals(getTaskID(), task.taskID) &&
                Objects.equals(getDescription(), task.description);

    }
    @Override
    public int hashCode(){
        return Objects.hash(taskID,description);
    }
}


