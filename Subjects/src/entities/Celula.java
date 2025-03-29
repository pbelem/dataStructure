package entities;

public class Celula {

    private Subject valor;
    private Celula proximo;

    public Celula() {
        super();
    }

    public Celula(Subject valor, Celula proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public Subject getValor() {
        return valor;
    }

    public void setValor(Subject valor) {
        this.valor = valor;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Celula{" +
                "valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}
