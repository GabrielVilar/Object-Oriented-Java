public class Party {
    
    private String start_date;
    private String end_date;
    private float total_value_party;
    private Client cliente = new Client();
    private Theme theme = new Theme();
    
    public String getStart_date() {
        return start_date;
    }
    public String getEnd_date() {
        return end_date;
    }
    public float getTotal_value_party() {
        return total_value_party;
    }
    public Client getCliente() {
        return cliente;
    }
    public Theme getTheme() {
        return theme;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    public void setTotal_value_party(float total_value_party) {
        this.total_value_party = total_value_party;
    }
    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Party(){}
    
    public Party(String start_date, String end_date, float total_value_party, Client cliente, Theme theme) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.total_value_party = total_value_party;
        this.cliente = cliente;
        this.theme = theme;
    }

    
    
    
}
