package aplication;

import entities.Subject;
import lists.ListaEncadeada;

public class Program {

    static Program testaListaEncadeada = new Program();
    static ListaEncadeada listaEncadeada = new ListaEncadeada();

    public static void main(String[] args) {

        testaListaEncadeada.addSubject(listaEncadeada);
        while (listaEncadeada.temProximo()) {
            System.out.println(listaEncadeada);
        }

        testaListaEncadeada.rmSubject();

        while (listaEncadeada.temProximo()) {
            System.out.println(listaEncadeada);
        }

    }

    public static void addSubject(ListaEncadeada listaEncadeada) {
        Subject subject1 = new Subject(1, "Logica de programacao e algoritmos", "Fernando", 9.00);
        Subject subject2 = new Subject(2, "Banco de dados", "Angela", 9.00);
        Subject subject3 = new Subject(3, "Programacao WEB", "Marcos", 10.00);

        listaEncadeada.adicionar(subject1);
        listaEncadeada.adicionar(subject2);
        listaEncadeada.adicionar(subject3);

    }

    public static void rmSubject() {
        listaEncadeada.remover();
    }

}