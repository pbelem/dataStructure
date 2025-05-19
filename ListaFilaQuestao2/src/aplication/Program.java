package aplication;

import listas.ContatoList;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContatoList lista = new ContatoList();

        while(true) {
            System.out.println("Oque deseja fazer?\n(1)Adicionar um novo contato\n(2)remover e exibir\n(3)Sair");
            switch (input.nextByte()) {
                case 1:
                    lista.adicionarContato();
                    break;
                case 2:
                    lista.proximoContato();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Resposta fora do intervalo solicitado");
            }
        }
    }
}
