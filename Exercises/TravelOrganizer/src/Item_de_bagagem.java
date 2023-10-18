public class Item_de_bagagem {

    private String nome;
    private String descricao;
    private String foto;

    public Item_de_bagagem(String nome, String descricao, String foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
    }    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Item_de_bagagem [nome=" + nome + ", descricao=" + descricao + ", foto=" + foto + "]";
    }

    public void cadastrarItem(){}
    public void editarItem(){}

}