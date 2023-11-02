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

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Aluno getAluno(int i){
        return alunos[i];
    }

    public String[] getNomeAlunos(){
        String[] strg = new String[nAlunos];
        for(int i = 0; i < nAlunos; i++){
            strg[i] = alunos[i].getNome();
        }
        return strg;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setAluno(int i, Aluno alu){
        alunos[i] = alu;
    }

    public int getnAlunos() {
        return nAlunos;
    }

    public void setnAlunos(int nAlunos) {
        this.nAlunos = nAlunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public Professor getProfessor(int i){
        return professores[i];
    }

    public String[] getNomeProfessores(){
        String[] str = new String[nProfs];
        for(int i = 0; i < nProfs; i++){
            str[i] = professores[i].getNome();
        }
        return str;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public void setProfessor(int i, Professor prof){
        professores[i] = prof;
    }

    public int getnProfs() {
        return nProfs;
    }

    public void setnProfs(int nProfs) {
        this.nProfs = nProfs;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public Curso getCurso(int i){
        return cursos[i];
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public void setCurso(int i, Curso c){
        cursos[i] = c;
    }

    public int getnCursos() {
        return nCursos;
    }

    public void setnCursos(int nCursos) {
        this.nCursos = nCursos;
    }

    public Matricula[] getMatriculas() {
        return matriculas;
    }

    public Matricula getMatricula(int i){
        return matriculas[i];
    }

    public void setMatriculas(Matricula[] matriculas) {
        this.matriculas = matriculas;
    }

    public void setMatricula(int i, Matricula matr){
        matriculas[i] = matr;
    }

    public int getnMatriculas() {
        return nMatriculas;
    }

    public void setnMatriculas(int nMatriculas) {
        this.nMatriculas = nMatriculas;
    }

}
