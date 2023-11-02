package data;

import courseManagement.*;

public class Dados {
    
    private Aluno[] alunos;
    private int nAlunos = 0;
    private Professor[] professores;
    private int nProfs = 0;
    private Curso[] cursos;
    private int nCursos = 0;
    private Matricula[] matriculas;
    private int nMatriculas = 0;

    public Dados(){
        alunos = new Aluno[100];
        professores = new Professor[50];
        cursos = new Curso[50];
    }

}
