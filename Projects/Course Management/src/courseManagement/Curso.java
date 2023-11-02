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
    
}
