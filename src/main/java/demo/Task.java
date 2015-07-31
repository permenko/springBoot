package demo;

import org.springframework.data.annotation.Id;

public class Task {

    @Id private String id;

    private String taskName;
    private Boolean taskStatus;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

}