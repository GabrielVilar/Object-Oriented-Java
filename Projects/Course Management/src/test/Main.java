package test;

import java.util.*;

import data.Dados;
import courseManagement.*;
import view.TelaListagem;

public class Main {

    private static Dados d = new Dados();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    public static String imprimirMenu(){
        String saida = new String("\nEscolha uma das opções a seguir:\n");
        saida = saida + "0 - Sair da aplicação\n";
        saida = saida + "1 - Cadastrar novo aluno\n";
        saida = saida + "2 - Remover aluno existente\n";
        saida = saida + "3 - Editar aluno existente\n";
        saida = saida + "4 - Listar alunos\n";
        saida = saida + "5 - Cadastrar novo professor\n";
        saida = saida + "6 - Remover professor existente\n";
        saida = saida + "7 - Editar professor existente\n";
        saida = saida + "8 - Listar professores\n";
        return saida;
    }

    public static boolean cadastrarAluno(){
        Aluno aln = lerDadosAluno();
        if (d.getnAlunos() < 100) {
            d.setAluno(d.getnAlunos(), aln);
            d.setnAlunos(d.getnAlunos() + 1);
            System.out.println("Aluno cadastrado com sucesso");
            return true;
        }else{
            System.out.println("Não foi possível cadastrar o aluno!");
            return false;
        }
    }

    public static Aluno lerDadosAluno(){
        String nome;
		String id; 
		String cpf; 
		String tel; 
		String dtNascimento; 
		String end;
        in.nextLine(); //esvazia dados do teclado
        System.out.println("Digite o nome do aluno: ");
		nome = in.nextLine();
		System.out.println("Digite o numero da identidade do aluno:");
		id = in.nextLine();
		System.out.println("Digite o cpf do aluno:");
		cpf = in.nextLine();
		System.out.println("Digite o telefone do aluno:");
		tel = in.nextLine();
		System.out.println("Digite a data de nascimento do aluno:");
		dtNascimento = in.nextLine();
		System.out.println("Digite o endereco do aluno:");
		end = in.nextLine();
		Aluno aln = new Aluno(nome, id, cpf, tel, dtNascimento, end);
		return aln;	
    }

    public static void removeAluno(){
        System.out.println("Escolha um dos alunos a seguir para ser removido:\n");
        listarAlunos();
        int i = in.nextInt();
        if (i < d.getnAlunos() && i > 0) {
            swapListaAlunos(i);
            d.setAluno(d.getnAlunos(), null);
            d.setnAlunos(d.getnAlunos() - 1);
            System.out.println("Aluno removido com sucesso");
        }else{
            System.out.println("Você escolheu um perfil invalido!");
        }
    }

    public static void swapListaAlunos(int a){
        for (int i = a; i < d.getnAlunos() - 1; i++) {
            d.setAluno(i, d.getAluno(i+1));
        }
    }

    public static void editar(int i, Aluno a){
        if (i < d.getnAlunos() && i >= 0) {
            d.setAluno(i, a);
            System.out.println("Dados editados com sucesso!");
        }else{
            System.out.println("Você escolheu um número inválido!");
        }
    }

    public static void listarAlunos(){
        in.nextLine();
        for (int i = 0; i < d.getnAlunos(); i++) {
            System.out.println(i + " -> " + d.getAlunos()[i].toString());
        }
        new TelaListagem(d.getNomeAlunos());
    }

    public static boolean cadastrarProfessor(){
        Professor p = lerDadosProfessor();
        if (d.getnProfs() < 100) {
            d.setProfessor(d.getnProfs(), p);
            d.setnAlunos(d.getnProfs() + 1);
            System.out.println("Professor cadastrado com sucesso!");
            return true;
        }else{
            System.out.println("Não foi possível cadastrar o professor\n");
            return false;
        }
    }

    public static Professor lerDadosProfessor(){
        String nome;
		String id; 
		String cpf; 
		String tel; 
		double valor;
		in.nextLine(); //esvazia dados do teclado
		System.out.println("Digite o nome do professor: ");
		nome = in.nextLine();
		System.out.println("Digite o numero da identidade do professor:");
		id = in.nextLine();
		System.out.println("Digite o cpf do professor:");
		cpf = in.nextLine();
		System.out.println("Digite o telefone do professor:");
		tel = in.nextLine();
		System.out.println("Digite o valor hora aula do professor:");
		valor = in.nextDouble();
		Professor p = new Professor(nome, id, cpf, tel, valor);
		return p;
    }

    public static void removerProfessor(){
        System.out.println("Escolha um dos professores a seguir para ser removido:\n");
        listarProfessores();
        int i = in.nextInt();
        if (i < d.getnProfs() && i > 0) {
            swapListaProfessores(i);
            d.setProfessor(d.getnProfs(), null);
            d.setnProfs(d.getnProfs() - 1);
            System.out.println("Professor removido com sucesso!");
        }else{
            System.out.println("Você escolheu um número inválido!");
        }    
    }

    public static void swapListaProfessores(int p){
        for (int i = 0; i < d.getnProfs() - 1; i++) {
            d.setProfessor(i, d.getProfessor( + 1));
        }
    }

    public static void editar(int i, Professor p){
        if (i < d.getnProfs() && i >= 0) {
            d.setProfessor(i, p);
            System.out.println("Dados editados com sucesso");
        }else{
            System.out.println("Você escolheu um número inválido!");
        }
    }

}
