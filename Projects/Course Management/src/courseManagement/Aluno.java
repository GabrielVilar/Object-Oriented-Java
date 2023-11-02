package courseManagement;

public class Aluno extends Pessoa{

    private String dataNasc;
    private String endereco;

    public Aluno(String nome, String numID, String cpf, String numTel, String dataNasc, String endereco) {
        super(nome, numID, cpf, numTel);
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }
    
}