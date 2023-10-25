import javax.swing.JOptionPane;

public class Travel {
    
    private String city;
    private String country;
    private String arrive_date;
    private String departure_date;
    private double min_temp;
    private double max_temp;

    public Travel(String city, String country, String arrive_date, String departure_date, double min_temp,
            double max_temp) {
        this.city = city;
        this.country = country;
        this.arrive_date = arrive_date;
        this.departure_date = departure_date;
        this.min_temp = min_temp;
        this.max_temp = max_temp;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setArrive_date(String arrive_date) {
        this.arrive_date = arrive_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public void setMin_temp(double min_temp) {
        this.min_temp = min_temp;
    }

    public void setMax_temp(double max_temp) {
        this.max_temp = max_temp;
    }

    public void registerTravel(){
        city = (JOptionPane.showInputDialog("Input the first number: "));
    }
    public void editTravel(){}
    
    @Override
    public String toString() {
        return "Travel [city=" + city + ", country=" + country + ", arrive_date=" + arrive_date + ", departure_date="
                + departure_date + ", min_temp=" + min_temp + ", max_temp=" + max_temp + "]";
    }
}