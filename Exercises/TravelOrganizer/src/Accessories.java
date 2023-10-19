public class Accessories extends Luggage_Item{

    private String type;
    private String corporal_region;

    public Accessories(String name, String description, String picture, String type, String corporal_region) {
        super(name, description, picture);
        this.type = type;
        this.corporal_region = corporal_region;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCorporal_region(String corporal_region) {
        this.corporal_region = corporal_region;
    }

    @Override
    public String toString() {
        return "Accessories [type=" + type + ", corporal_region=" + corporal_region + "]";
    }
    
}
