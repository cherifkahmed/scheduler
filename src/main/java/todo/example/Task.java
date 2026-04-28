package todo.example;

/**
 * task
 */
public class Task {
    private int id;
    private String content;
    private boolean isDone;
    private String creationDate;
    private int nbdone;

    public Task(int id, String content, String creationDate, int nbdone) {
        this.id = id;
        this.content = content;
        this.isDone = false;
        this.creationDate = creationDate;
        this.nbdone = nbdone;
    }

    @Override
    public String toString() {

        return "Task: " + content + " created at[" + creationDate + "]" + (isDone ? "[V]" : "[]");

    }

    public int getId() {
        return id;
    }

    // content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // isDone
    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    // creationDate
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
