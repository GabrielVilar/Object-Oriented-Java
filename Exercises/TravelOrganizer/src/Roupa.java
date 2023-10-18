public class Roupa extends Item_de_bagagem{
    
    private double tenp_min;
    private boolean res_agua;
    
    public Roupa(String nome, String descricao, String foto, double tenp_min, boolean res_agua) {
        super(nome, descricao, foto);
        this.tenp_min = tenp_min;
        this.res_agua = res_agua;
    }

    public void setTenp_min(double tenp_min) {
        this.tenp_min = tenp_min;
    }

    public void setRes_agua(boolean res_agua) {
        this.res_agua = res_agua;
    }

    public void cadastra_roupa(){
        
    }

    @Override
    public String toString() {
        return "Roupa [tenp_min=" + tenp_min + ", res_agua=" + res_agua + "]";
    }

    

    
}
