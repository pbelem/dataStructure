package entities;

public class Celula {

    private Teacher valor;
    private Celula proximo;

    public Celula() {
        super();
    }

    public Celula(Teacher valor, Celula proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public Teacher getValor() {
        return valor;
    }

    public void setValor(Teacher valor) {
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
