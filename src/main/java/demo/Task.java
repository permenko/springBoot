package demo;

import org.springframework.data.annotation.Id;

public class Task {

    @Id private String id;

    String task;

    public String getTask() {
        return  task;
    }

    public void setTask(String task) {
        this.task = task;
    }

}
