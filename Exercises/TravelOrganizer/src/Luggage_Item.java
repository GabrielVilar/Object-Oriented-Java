public class Luggage_Item {

    private String name;
    private String description;
    private String picture;

    public Luggage_Item(String name, String description, String picture) {
        this.name = name;
        this.description = description;
        this.picture = picture;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Luggage_Item [name=" + name + ", description=" + description + ", picture=" + picture + "]";
    }

    public void registerItem(){}
    public void editItem(){}

}