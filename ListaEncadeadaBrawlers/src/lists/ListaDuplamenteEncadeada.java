package lists;

import entities.Brawler;
import entities.Nodo;

public class ListaDuplamenteEncadeada {
    //       inicio v                                          v fim
    // null <--||dado0|| <--> ||dado1|| <--> ||dado2|| <--> ||dado3|| --> null

    private Nodo primeiro = null;
    private int n;
    private Nodo ultimo = null;

    //vamos fazer um metodo para inserirEsquerda
    public void inserirListaEsquerda(Brawler brawler) {
        Nodo aux = new Nodo();
        aux.dado = brawler;
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
            aux.anterior = null;
        } else {
            aux.proximo = primeiro;
            aux.anterior = null;
            primeiro = aux;
        }
        n++;
    }

    //vams fazer um inserir a direita?
    public void inserirListaDireita(Brawler brawler) {
        Nodo aux = new Nodo();
        Nodo temporario;
        aux.dado = brawler;
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        } else {
            temporario = ultimo;
            temporario.proximo = aux;
            aux.anterior = temporario;
            aux.proximo = null;
            ultimo = aux;

        }
        n++;
    }


    //remover da lista da esquerda
    public Brawler removerListaEsquerda() {
        Nodo aux = primeiro;
        Brawler brawler;
        if(n == 0) {
            return null;
        } else {
            brawler = aux.dado;
            n--;
            if (n == 0) {
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = aux.proximo;
                primeiro.anterior = null;
            }
            return brawler;
        }
    }

    //remover a direita
    public Brawler removerListaDireita() {
        Nodo antes, aux = ultimo;
        Brawler brawler;
        if (n==0) {
            return null;
        } else {
            brawler = aux.dado;
            n--;
            if (n==0) {
                primeiro = null;
                ultimo = null;
            } else {
                antes = aux.anterior;
                ultimo = antes;
                antes.proximo = null;
            }
            return brawler;
        }
    }

    public void listarListaImprimir() {
        Nodo aux = primeiro;
        System.out.println("Será que vai funcionar?? Vamos lá");
        if (aux!= null) {
            while (aux != null) {
                System.out.println(aux.dado + " ");
                aux = aux.proximo;
            }
        }else {
            System.out.println("Moral a lista ta vaziaaaaaa... ");
        }

        System.out.println();
    }


    //listarlista = imprimir
    public void ListarListaImprimir() {
        Nodo aux = primeiro;
        System.out.println("Para Meus queridos alunos listar uma  lista duplamente encadeada");
        if(aux != null) {
            while (aux !=null) {
                System.out.print(aux.dado + " ");
                aux = aux.proximo;
            }
        }else {
            System.out.println("Você está tentando imprimir uma lista vazia :(");
        }
        System.out.println();
    }
}
