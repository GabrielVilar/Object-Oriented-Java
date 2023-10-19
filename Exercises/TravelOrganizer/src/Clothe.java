public class Clothe extends Luggage_Item{
    
    private double min_temp;
    private boolean water_resistence;
    
    public Clothe(String name, String description, String picture, double min_temp, boolean water_resistence) {
        super(name, description, picture);
        this.min_temp = min_temp;
        this.water_resistence = water_resistence;
    }

    public void setMin_temp(double min_temp) {
        this.min_temp = min_temp;
    }

    public void setWater_resistence(boolean water_resistence) {
        this.water_resistence = water_resistence;
    }

    @Override
    public String toString() {
        return "Clothe [min_temp=" + min_temp + ", water_resistence=" + water_resistence + "]";
    }

    public void register_clothes(){
    
    }   
}
