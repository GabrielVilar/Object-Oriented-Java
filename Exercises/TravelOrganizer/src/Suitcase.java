public class Suitcase {

    //itens;
    private String color;
    private String size;

    public Suitcase(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Suitcase [color=" + color + ", size=" + size + "]";
    }

    public void registerSuitcase(){}
    public void editSuitcase(){}
    //public boolean deleteSuitcaseItems(){}
    public void addBasicItems(){}


}