package todo.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting the journey!");

        while (true) {
            System.out.println("1. add task");
            System.out.println("2. remove task");
            System.out.println("3. update task");
            System.out.println("4. show task");
            System.out.println("5. mark done");
            System.out.println("6. exit");

            int i = sc.nextInt();
            sc.nextLine();
            switch (i) {
                case 1:
                    String text = sc.nextLine();
                    manager.addTask(text);
                    break;
                case 2:
                    System.out.println("Enter id of the task to be removed: ");
                    int id = sc.nextInt();
                    manager.removeTask(id);
                    sc.nextLine();
                    break;

                case 3:
                    System.out.println("Enter Task id to be updated: ");
                    int idu = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter updated task: ");
                    String ub = sc.nextLine();
                    manager.updateTask(idu, ub);
                    break;
                case 4:
                    manager.showTask();
                    break;
                case 5:
                    System.out.println("Enter Task id: ");
                    int idm = sc.nextInt();
                    manager.markDone(idm);
                    break;
                case 6:
                    System.out.println("good bye <3");
                    return;
                default:
                    System.out.println("invalid command");
                    break;
            }

        }

    }

}
