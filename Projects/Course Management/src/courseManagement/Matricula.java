package courseManagement;

public class Matricula {
    
    private Aluno aluno;
    private String data;
    private double valorPago;
    private String turma;

    public Matricula(Aluno aluno, String data, double valorPago, String turma) {
        this.aluno = aluno;
        this.data = data;
        this.valorPago = valorPago;
        this.turma = turma;
    }

}
