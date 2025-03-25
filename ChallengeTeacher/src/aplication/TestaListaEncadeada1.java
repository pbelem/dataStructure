package aplication;

import entities.Teacher;
import lists.ListaEncadeada;

public class TestaListaEncadeada1 {

	static TestaListaEncadeada1 testaListaEncadeada1 = new TestaListaEncadeada1();
	static ListaEncadeada listaEncadeada = new ListaEncadeada();

	public static void main(String[] args) {

		testaListaEncadeada1.addTeacher(listaEncadeada);
		while (listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada);
		}

		testaListaEncadeada1.rmTeacher();

		while (listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada);
		}
	}

	public static void addTeacher(ListaEncadeada listaEncadeada) {
		Teacher teacher1 = new Teacher(1, "Osvaldo", "ORM@gmail.com");
		Teacher teacher2 = new Teacher(2, "Angela", "angelinha@gmail.com");
		Teacher teacher3 = new Teacher(3, "Marcos", "exterminadorDeFuturos@gmail.com");

		listaEncadeada.adicionar(teacher1);
		listaEncadeada.adicionar(teacher2);
		listaEncadeada.adicionar(teacher3);

	}

	public static void rmTeacher() {
		listaEncadeada.remover();
	}

}