package courseManagement;

public class Curso {
    
    private String nome;
    private String dtInicio;
    private String dtTermino;
    private int horaInicio;
    private int horaTermino;
    private int cargaHorario;
    private String conteudoProg;
    private Professor professor;
    private double valor;
    private Matricula[] alunosMatriculados = new Matricula[40];
    private int numAlunos;

    public Curso(String nome, String conteudoProg, Professor professor, double valor) {
        this.nome = nome;
        this.conteudoProg = conteudoProg;
        this.professor = professor;
        this.valor = valor;
        this.numAlunos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public String getConteudoProg() {
        return conteudoProg;
    }

    public Professor getProfessor() {
        return professor;
    }

    public double getValor() {
        return valor;
    }

    public Matricula[] getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraTermino(int horaTermino) {
        this.horaTermino = horaTermino;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public void setConteudoProg(String conteudoProg) {
        this.conteudoProg = conteudoProg;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAlunosMatriculados(Matricula[] alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", dtInicio=" + dtInicio + ", dtTermino=" + dtTermino + ", horaInicio="
                + horaInicio + ", horaTermino=" + horaTermino + ", cargaHorario=" + cargaHorario + ", conteudoProg="
                + conteudoProg + ", professor=" + professor + ", valor=" + valor + ", numAlunos=" + numAlunos + "]";
    }

    public boolean matricular(Matricula matri){
        if (numAlunos < 40) {
            alunosMatriculados[numAlunos] = matri;
            numAlunos++;
            return true;
        }else{
            return false;
        }
    }
    
}
