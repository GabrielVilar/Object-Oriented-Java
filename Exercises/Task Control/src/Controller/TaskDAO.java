package Controller;

import java.util.Scanner;

import Model.Task;

public class TaskDAO {
    
    public static void main(String[] args) {
        boolean loop = true;
        int op;
        Scanner sc = new Scanner(System.in);
        Task tsk = new Task();

        while (loop) {
            System.out.println("____________________________________"
                                +"Chose one of the following option:"
                                +"\n(1) Create a task"
                                +"\n(2) Visualize the existent tasks"
                                +"\n(3) Edit a task"
                                +"\n(4) Delete a task");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    tsk.register();
                    break;
                case 2:
                    tsk.toString();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    break;
            }
        }
        
    }
}
