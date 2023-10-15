package Model;

public class Task {

    private String name;
    private String deadline;
    private String description;
    private String completionDate;
    private float priorityNumber;
    private double completedPercentage;
    
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
    public double getCompletedPercentage() {
        return completedPercentage;
    }
    public void setCompletedPercentage(double completedPercentage) {
        this.completedPercentage = completedPercentage;
    }

    public Task(){}

    public Task(String name, String deadline, String description, String completionDate, float priorityNumber,
            double completedPercentage) {
        this.name = name;
        this.deadline = deadline;
        this.description = description;
        this.completionDate = completionDate;
        this.priorityNumber = priorityNumber;
        this.completedPercentage = completedPercentage;
    }

    
    
    public String toString(){
        return "Task Control"
              +"\nName of the task: "+getName()
              +"\nTask description: "+getDescription()
              +"\nTask deadline: "+getDeadline()
              +"\nTask priority: "+getPriorityNumber()
              +"\nTask completed percentage: "+getCompletedPercentage()
              +"\nTask completion date: "+getCompletionDate()+"\n";
    }
    
}
