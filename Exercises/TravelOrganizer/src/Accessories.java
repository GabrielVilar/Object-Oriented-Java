public class Acessorio extends Item_de_bagagem{

    private String tipo;
    private String regiao_corpo;

    public Acessorio(String nome, String descricao, String foto, String tipo, String regiao_corpo) {
        super(nome, descricao, foto);
        this.tipo = tipo;
        this.regiao_corpo = regiao_corpo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRegiao_corpo(String regiao_corpo) {
        this.regiao_corpo = regiao_corpo;
    }

    @Override
    public String toString() {
        return "Acessorio [tipo=" + tipo + ", regiao_corpo=" + regiao_corpo + "]";
    }

    

    
}
