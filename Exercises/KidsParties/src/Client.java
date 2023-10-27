public class Client {
    
    private String name;
    private String cell_phone;
    private int time;
    
    public String getName() {
        return name;
    }
    public String getCell_phone() {
        return cell_phone;
    }
    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public Client(){}

    public Client(String name, String cell_phone, int time) {
        this.name = name;
        this.cell_phone = cell_phone;
        this.time = time;
    }   

}
