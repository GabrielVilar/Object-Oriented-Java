package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Task;

public class TaskDAO {
    
    public static void main(String[] args) {
        
        boolean loop = true;        
        int op;
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> taskList = new ArrayList<>();
        Task tsk = new Task();

        while (loop) {
            System.out.println("____________________________________\n"
                                +"Chose one of the following option:"
                                +"\n(1) Create a task"
                                +"\n(2) Visualize the existent tasks"
                                +"\n(3) Edit a task"
                                +"\n(4) Delete a task"
                                +"\n(5) Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Task newTask = new Task(); // Crie uma nova instância de Task
                    newTask.register();
                    taskList.add(newTask); // Adicione a nova instância à lista
                break;
                case 2:
                    for (Task t : taskList) {
                        System.out.println(t.toString());
                    }
                    break;
                case 3:
                    System.out.println("Enter the index of the task you want to edit: ");
                    int taskIndex = sc.nextInt();
                    if (taskIndex >= 0 && taskIndex < taskList.size()) {
                        taskList.get(taskIndex).edit();
                    }else{
                        System.out.println("Invalid task index\nThis task does not exist!\n"
                                           +"Maybe you inputted the wrong task index\n"
                                           +"Remember that the first task has index equals to 0 and not 1 as usual");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        
    }
}
