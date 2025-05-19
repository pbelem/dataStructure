package lists;

import entities.Cliente;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClienteList {
    Queue<String> fila = new LinkedList<>();

    public void InserirCliente() {
        fila.add("Carlos");
        fila.add("Fabiana");
    }
    public void RemoverCliente() {
        fila.remove();
    }
    public void ConsultarQuantitadeCliente() {
        System.out.println("A fila contém " + fila.size());
    }

}
