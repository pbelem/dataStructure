package aplication;

import entities.Contato;
import lists.ListaEncadeada;

public class TestaListaEncadeada {

	static TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
	static ListaEncadeada listaEncadeada = new ListaEncadeada();
	
	public static void main(String[] args) {

		testaListaEncadeada.addContato(listaEncadeada);
		while (listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada);
		}
		
		testaListaEncadeada.rmContato();
		
		while (listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada);
		}
	}

	public static void addContato(ListaEncadeada listaEncadeada) {
		Contato contato1 = new Contato(1, "Belem", "pedro@gmail.com");
		Contato contato2 = new Contato(2, "Angela", "angelinha@gmail.com");
		Contato contato3 = new Contato(3, "Joao", "nino03@gmail.com");

		listaEncadeada.adicionar(contato1);
		listaEncadeada.adicionar(contato2);
		listaEncadeada.adicionar(contato3);

	}

	public static void rmContato() {
		listaEncadeada.remover();
	}

}