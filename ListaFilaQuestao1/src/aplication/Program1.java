package aplication;

import fila.Musicas;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Musicas musica = new Musicas();

        while (true) {
            System.out.println("Oque deseja fazer?\n(1)Inserir nova musica\n(2)Consultar musica\n(3)Remover musica\n(4)Sair");
            switch (input.nextByte()) {
                case 1:
                    musica.inserirMusica();
                    break;
                case 2:
                    musica.consultarMusica();
                    break;
                case 3:
                    musica.removerMusica();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Resposta fora do intervalo solicitado");
            }
        }
    }
}
