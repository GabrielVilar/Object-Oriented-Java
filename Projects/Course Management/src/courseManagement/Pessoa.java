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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", numID=" + numID + ", cpf=" + cpf + ", numTel=" + numTel + "]";
    } 

}
