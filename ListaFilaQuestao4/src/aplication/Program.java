package aplication;

import lists.AlunoList;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AlunoList alunos = new AlunoList();
        while (true) {
            System.out.println("Oque deseja fazer?\n(1)Inserir novos alunos\n(2)Consultar alunos\n(4)Sair");
            switch (input.nextByte()) {
                case 1:
                    alunos.InserirAlunos();
                    break;
                case 2:
                    alunos.ConsultarAlunos();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Resposta fora do intervalo solicitado");
            }
        }

    }
}


