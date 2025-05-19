package aplication;

import lists.ClienteList;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClienteList clientes = new ClienteList();

        while (true) {
            System.out.println("Oque deseja fazer?\n(1)Adicionar um novo cliente\n(2)remover cliente\n(3)Consultar a quantidade de clientes\n(4)Sair");
            switch (input.nextByte()) {
                case 1:
                    clientes.InserirCliente();
                    break;
                case 2:
                    clientes.RemoverCliente();
                    break;
                case 3:
                    clientes.ConsultarQuantitadeCliente();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Resposta fora do intervalo solicitado");
            }
        }
    }
}
