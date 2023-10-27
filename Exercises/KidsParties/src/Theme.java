public class Theme {
    
    private String item;
    private float value;
    private String towel_color;
    
    public String getItem() {
        return item;
    }
    public float getValue() {
        return value;
    }
    public String getTowel_color() {
        return towel_color;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public void setTowel_color(String towel_color) {
        this.towel_color = towel_color;
    }

    public Theme(){}

    public Theme(String item, float value, String towel_color) {
        this.item = item;
        this.value = value;
        this.towel_color = towel_color;
    }

}
