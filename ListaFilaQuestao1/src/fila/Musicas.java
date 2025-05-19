package fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Musicas {

    Queue<String> fila = new LinkedList<>();

    public void inserirMusica() {
        fila.add("Amerie - 1 Thing");
        fila.add("M83 'Midnight City'");
        fila.add("Stardust - Music Sounds Better With You");
        fila.add("Bronski Beat - Smalltown Boy");
        fila.add("Modjo - Lady (Hear Me Tonight)");
        fila.add("Rita Lee - Amor e sexo");
    }

    public void consultarMusica() {
        Iterator<String> it = fila.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void removerMusica() {
        fila.remove();
    }

    public void checarSeListaVazia() {
        if (fila.isEmpty()) {
            System.out.println("A sua fila esta vazia");
        } else {
            System.out.println("A fila contém elementos");
        }

    }
}
