package todo.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Starting the journey!");

        while (true) {

            try {

                System.out.println("1. add task");
                System.out.println("2. remove task");
                System.out.println("3. update task");
                System.out.println("4. show task");
                System.out.println("5. mark done");
                System.out.println("6. exit");

                int i = Integer.parseInt(sc.nextLine());

                switch (i) {

                    case 1:

                        System.out.println("1. Personal");
                        System.out.println("2. Work");

                        int ttype = Integer.parseInt(sc.nextLine());

                        System.out.println("Enter task content: ");
                        String text = sc.nextLine();

                        if (ttype == 1) {

                            System.out.println("Enter category: ");
                            String category = sc.nextLine();

                            manager.addPersonalTask(text, category);

                        } else if (ttype == 2) {

                            System.out.println("Enter priority: ");
                            String priority = sc.nextLine();

                            manager.addWorkTask(text, priority);

                        } else {

                            System.out.println("Invalid task type");
                        }

                        break;

                    case 2:

                        System.out.println("Enter id of the task to be removed: ");

                        int id = Integer.parseInt(sc.nextLine());

                        manager.removeTask(id);

                        System.out.println("Task removed successfully");

                        break;

                    case 3:

                        System.out.println("Enter Task id to be updated: ");

                        int idu = Integer.parseInt(sc.nextLine());

                        System.out.println("Enter updated task: ");

                        String ub = sc.nextLine();

                        manager.updateTask(idu, ub);

                        System.out.println("Task updated successfully");

                        break;

                    case 4:

                        manager.showTask();

                        break;

                    case 5:

                        System.out.println("Enter Task id: ");

                        int idm = Integer.parseInt(sc.nextLine());

                        manager.markDone(idm);

                        System.out.println("Task marked as done");

                        break;

                    case 6:

                        System.out.println("good bye <3");

                        sc.close();

                        return;

                    default:

                        System.out.println("invalid command");

                        break;
                }

            } catch (TaskNotFoundException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number");

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {

                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
