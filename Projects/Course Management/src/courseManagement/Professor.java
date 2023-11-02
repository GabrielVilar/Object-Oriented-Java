package courseManagement;

public class Professor extends Pessoa{
    
    private double valorHoraAula;

    public Professor(String nome, String numID, String cpf, String numTel, double valorHoraAula) {
        super(nome, numID, cpf, numTel);
        this.valorHoraAula = valorHoraAula;
    }
    
}
