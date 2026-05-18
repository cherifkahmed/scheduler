package todo.example;

public class WorkTask extends Task {
    private String priority;


    public WorkTask(int id, String content, String creationDate, int nbdone, String priority) {
        super(id, content, creationDate, nbdone);
        this.priority = priority;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Work]" + super.toString() + "Priority" + priority;
    }


}
