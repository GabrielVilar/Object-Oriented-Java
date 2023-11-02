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

    public Aluno getAluno() {
        return aluno;
    }

    public String getData() {
        return data;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getTurma() {
        return turma;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Matricula [aluno=" + aluno + ", data=" + data + ", valorPago R$" + valorPago + ", turma=" + turma + "]";
    }

}
