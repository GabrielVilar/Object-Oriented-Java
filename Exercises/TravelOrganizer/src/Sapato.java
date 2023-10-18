public class Sapato extends Item_de_bagagem{
    
    private String tipo;
    private String cor;
    private boolean res_agua;

    public Sapato(String nome, String descricao, String foto, String tipo, String cor, boolean res_agua) {
        super(nome, descricao, foto);
        this.tipo = tipo;
        this.cor = cor;
        this.res_agua = res_agua;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRes_agua(boolean res_agua) {
        this.res_agua = res_agua;
    }

    @Override
    public String toString() {
        return "Sapato [tipo=" + tipo + ", cor=" + cor + ", res_agua=" + res_agua + "]";
    }

    

    
}
