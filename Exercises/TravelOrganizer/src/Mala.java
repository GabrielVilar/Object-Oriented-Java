public class Mala {

    //itens;
    private String cor;
    private String tamanho;

    public Mala(String cor, String tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Mala [cor=" + cor + ", tamanho=" + tamanho + "]";
    }

    public void cadastrarMala(){}
    public void editarMala(){}
    //public boolean deletarItemBagagem(){}
    public void addItensBasicos(){}


}