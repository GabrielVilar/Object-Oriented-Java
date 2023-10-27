public class Theme {
    
    private String item;
    private float value;
    private String tablecloth_color;
    
    public String getItem() {
        return item;
    }
    public float getValue() {
        return value;
    }
    public String getTablecloth_color() {
        return tablecloth_color;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public void setTablecloth_color(String tablecloth_color) {
        this.tablecloth_color = tablecloth_color;
    }

    public Theme(){}

    public Theme(String item, float value, String tablecloth_color) {
        this.item = item;
        this.value = value;
        this.tablecloth_color = tablecloth_color;
    }

}
