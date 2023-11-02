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


}
