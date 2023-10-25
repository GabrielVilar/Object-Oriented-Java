package Model;

import java.util.Scanner;

public class Task {

    private String name;
    private String deadline;
    private String description;
    private String completionDate;
    private float priorityNumber;
    private float completedPercentage;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCompletionDate() {
        return completionDate;
    }
    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }
    public float getPriorityNumber() {
        return priorityNumber;
    }
    public void setPriorityNumber(float priorityNumber) {
        this.priorityNumber = priorityNumber;
    }
    public float getCompletedPercentage() {
        return completedPercentage;
    }
    public void setCompletedPercentage(float completedPercentage) {
        this.completedPercentage = completedPercentage;
    }

    public Task(){}

    public Task(String name, String deadline, String description, String completionDate, float priorityNumber,
            float completedPercentage) {
        this.name = name;
        this.deadline = deadline;
        this.description = description;
        this.completionDate = completionDate;
        this.priorityNumber = priorityNumber;
        this.completedPercentage = completedPercentage;
    }

    Scanner sc = new Scanner(System.in);

    public void register(){
        
        System.out.println("Let's register a task");        
        System.out.println("Whats the name of the text? ");
        setName(sc.nextLine());
        System.out.println("Input a tesk description: ");
        setDescription(sc.nextLine());
        System.out.println("When is the task deadline? ");
        setDeadline(sc.nextLine());
        System.out.println("What's the task priority in a scale of 1 to 10? ");
        setPriorityNumber(sc.nextFloat());
        System.out.println("How much of the task is completed in percentage? ");
        setCompletedPercentage(sc.nextFloat());
        sc.nextLine();

        if (getCompletedPercentage() == 100.0) {
            System.out.println("When did you finish the task? ");
            setCompletionDate(sc.nextLine());
        }else{
            setCompletionDate("The task is still going on");
        }
    }

    public void edit(){

        System.out.println("Editing task: "+ getName());
        System.out.println("Enter new task name (press Enter to keep the same): ");
        String newName = sc.nextLine();
        if(!newName.isEmpty()){
            setName(newName);
        }

        System.out.println("Enter new task description (press Enter to keep the same): ");
        String newDescription = sc.nextLine();
        if (!newDescription.isEmpty()) {
            setDescription(newDescription);
        }

        System.out.println("Enter new task deadline (press Enter to keep the same): ");
        String newDeadLine = sc.nextLine();
        if (!newDeadLine.isEmpty()) {
            setDeadline(newDeadLine);
        }

        System.out.println("Enter new task priority in a scale of 1 to 10 (press Enter to keep the same): ");
        String newPriority = sc.nextLine();
        if (!newPriority.isEmpty()) {
            setPriorityNumber(Float.parseFloat(newPriority));
        }

        System.out.println("Enter new task completed percentage (press Enter to keep the same): ");
        String newPercentage = sc.nextLine();
        if (!newPercentage.isEmpty()) {
            setCompletedPercentage(Float.parseFloat(newPercentage));
        }

        if (getCompletedPercentage() == 100.0) {
            System.out.println("Enter new task completion date: ");
            String newCompletionDate = sc.nextLine();
            if (!newCompletionDate.isEmpty()) {
                setCompletionDate(newCompletionDate);
            }
            while (newCompletionDate.isEmpty()) {
                System.out.println("Pleas enter new task completion date: ");
                newCompletionDate = sc.nextLine();
                if (!newCompletionDate.isEmpty()) {
                    setCompletionDate(newCompletionDate);
                    break;
                }
            }
        }
    }

    public String toString(){
        return "-------------------------------"
              +"\nTask Control"
              +"\nName of the task: "+getName()
              +"\nTask description: "+getDescription()
              +"\nTask deadline: "+getDeadline()
              +"\nTask priority: "+getPriorityNumber()
              +"\nTask completed percentage: "+getCompletedPercentage()
              +"\nTask completion date: "+getCompletionDate()
              +"\n";
    }
    
}
