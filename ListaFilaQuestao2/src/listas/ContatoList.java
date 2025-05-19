package listas;

import entities.Contato;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ContatoList {

    Scanner input = new Scanner(System.in);
    Queue<Contato> fila = new LinkedList<>();
    Contato contato;

    public void adicionarContato() {
        System.out.println("Informe o nome do contato: ");
        String nome = input.nextLine();
        System.out.println("Informe o numero do contato: ");
        String numero = input.nextLine();
        System.out.println("Informe o email do contato: ");
        String email = input.nextLine();
        Contato contato1 = new Contato(nome, numero, email);
        fila.add(contato1);
    }

    public void proximoContato() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum contato na fila!");
        } else {
            System.out.println("Próximo contato: " + fila.poll());
        }
    }
}
