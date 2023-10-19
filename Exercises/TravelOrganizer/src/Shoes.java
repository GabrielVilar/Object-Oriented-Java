public class Shoes extends Luggage_Item{
    
    private String type;
    private String color;
    private boolean water_resistence;

    public Shoes(String name, String description, String picture, String type, String color, boolean water_resistence) {
        super(name, description, picture);
        this.type = type;
        this.color = color;
        this.water_resistence = water_resistence;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWater_resistence(boolean water_resistence) {
        this.water_resistence = water_resistence;
    }

    @Override
    public String toString() {
        return "Shoes [type=" + type + ", color=" + color + ", water_resistence=" + water_resistence + "]";
    }
         
}
