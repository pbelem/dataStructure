package lists;

import entities.Celula;
import entities.Teacher;

public class ListaEncadeada<E> {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	public Celula getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}

	public Celula getUltimo() {
		return ultimo;
	}

	public void setUltimo(Celula ultimo) {
		this.ultimo = ultimo;
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Celula posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	public void adicionar(Teacher valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if(primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			;
			ultimo = celula;
		}

	}

	public boolean temProximo() {

		if(primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
		
	}

	public void remover() {
		if(primeiro.getProximo() != null) {
			Celula celula = recuperarPenultimo(primeiro);
			ultimo = celula;
			ultimo.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
	}

	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}

	@Override
	public String toString() {
		return "ListaEncadeada [primeiro=" + primeiro + "\n, ultimo=" + ultimo + "\n, posicaoAtual=" + posicaoAtual + "]\n";
	}
	
	

}
