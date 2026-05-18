package todo.example;


public class PersonalTask extends Task {
    private String category;

    public PersonalTask(int id, String content, String creationDate, int nbdone, String category) {
        super(id, content, creationDate, nbdone);
        this.category = category;

    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Work]" + super.toString() + "Category" + category;
    }



}
