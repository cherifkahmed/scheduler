package todo.example;

import java.util.List;
import java.util.ArrayList;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int counter = 1;

    public void addTask(String content) {
        System.out.println("enter contet ");
        tasks.add(new Task(counter++, content, "now", 0));
    };

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    };

    public void updateTask(int id, String content) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setContent(content); 
            }
        }
    }

    public void markDone(int id) {
        for (Task t : tasks) {
            if  (t.getId() == id){
                t.setDone(true);
            }
        }
    }

    public void showTask() {
        for (Task t : tasks) {
            System.out.println("[" + t.getId() + "]" + t);
        }
    }

}
