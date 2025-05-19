package entities;

public class Celula {

    private Brawler valor;
    private Celula proximo;

    public Celula() {
        super();
    }

    public Celula(Brawler valor, Celula proximo) {
        super();
        this.valor = valor;
        this.proximo = proximo;
    }

    public Brawler getValor() {
        return valor;
    }

    public void setValor(Brawler valor) {
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
