package todo.example;

import java.util.List;
import java.util.ArrayList;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();
    private int counter = 1;

    public void addTask(String content) {

        if (content.isEmpty()) {
            throw new IllegalArgumentException("Task content cannot be empty");
        }

        tasks.add(new Task(counter++, content, "now", 0));
    }

    public void addWorkTask(String content, String priority) {

        if (content.isEmpty()) {
            throw new IllegalArgumentException("Task content cannot be empty");
        }

        tasks.add(new WorkTask(counter++, content, "now", 0, priority));
    }

    public void addPersonalTask(String content, String category) {

        if (content.isEmpty()) {
            throw new IllegalArgumentException("Task content cannot be empty");
        }

        tasks.add(new PersonalTask(counter++, content, "now", 0, category));
    }

    public void removeTask(int id) throws TaskNotFoundException {

        boolean found = false;

        for (Task t : tasks) {

            if (t.getId() == id) {
                tasks.remove(t);
                found = true;
                break;
            }
        }

        if (!found) {
            throw new TaskNotFoundException("Task with id " + id + " not found");
        }
    }

    public void updateTask(int id, String content) throws TaskNotFoundException {

        boolean found = false;

        for (Task t : tasks) {

            if (t.getId() == id) {
                t.setContent(content);
                found = true;
                break;
            }
        }

        if (!found) {
            throw new TaskNotFoundException("Task with id " + id + " not found");
        }
    }

    public void markDone(int id) throws TaskNotFoundException {

        boolean found = false;

        for (Task t : tasks) {

            if (t.getId() == id) {
                t.setDone(true);
                found = true;
                break;
            }
        }

        if (!found) {
            throw new TaskNotFoundException("Task with id " + id + " not found");
        }
    }

    public void showTask() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks available");
            return;
        }

        for (Task t : tasks) {
            System.out.println("[" + t.getId() + "] " + t);
        }
    }
}
