package courseManagement;

public abstract class Pessoa {
    
    protected String nome;
    protected String numID;
    protected String cpf;
    protected String numTel;

    public Pessoa(String nome, String numID, String cpf, String numTel) {
        this.nome = nome;
        this.numID = numID;
        this.cpf = cpf;
        this.numTel = numTel;
    }

}
