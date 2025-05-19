package entities;


public class Nodo {

    // |1|   2    |3|  --> 1 anterior, 2 elemento, 3 - proximo
    public Nodo anterior = null;
    public Brawler dado;
    public Nodo proximo = null;


    public Nodo getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public Nodo getProximo() {
        return proximo;
    }
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }



}
