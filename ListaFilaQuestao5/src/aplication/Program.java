package aplication;

import lists.PacienteLists;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PacienteLists pacientes = new PacienteLists();

        while (true) {
            System.out.println("O que deseja fazer?\n(1)Adicionar um novo paciente\n(2)Atender paciente\n(3)Verificar se há paciente\n(4)Próximo paciente a ser atendido" +
                    "\n(5)Quantidade de pacientes que aguardam atendimento\n(6)Sair");

            byte opcao = input.nextByte();
            input.nextLine();

            switch (opcao) {
                case 1:
                    pacientes.inserirPaciente();
                    break;
                case 2:
                    pacientes.atenderPaciente();
                    break;
                case 3:
                    pacientes.temPaciente();
                    break;
                case 4:
                    pacientes.proximoPacienteSerAtendido();
                    break;
                case 5:
                    pacientes.numeroPacienteAguardandoAtendimento();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Resposta fora do intervalo solicitado");
            }
        }
    }
}
