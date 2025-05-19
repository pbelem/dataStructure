package atividadeAula0105;

import java.util.Stack;

public class ListaAlunos {
    Stack<String> pilha = new Stack<>();

    public void adicionarNaLista() {
        pilha.push("AMANDA OLIVEIRA DA SILVA");
        pilha.push("ANDERSON DOS SANTOS");
        pilha.push("ANGELA PEIXOTO SANTANA");
        pilha.push("ARTHUR GABRIEL");
        pilha.push("CID VINICIUS");
        pilha.push("EBER EBERT");
        pilha.push("ERICA BARROS");
        pilha.push("FELIPE LOBO DE SANTANA");
        pilha.push("ISABEL DE OLIVEIRA");
        pilha.push("JOAO MARCOS");
        pilha.push("JUVENAL ROSA ALVES");
        pilha.push("LUCAS ALEX VILAS");
        pilha.push("LUIS MIGUEL LYRA");
        pilha.push("PAULO SERGIO");
        pilha.push("PEDRO HENRIQUE");
        pilha.push("PEDRO LEAL");
        pilha.push("VITOR DE JESUS");
        pilha.push("YURI GABRIEL FERREIRA");
        pilha.push("PEDRO BELEM");
    }

    public void checarListaVazia() {
        if (pilha.isEmpty()) {
            System.out.println("Sua pilha esta vazia!");
        } else {
            System.out.println("Sua pilha tem dados");
        }
    }

    public void imprimirTopoLista() {
        System.out.println("O topo da sua pilha é " + pilha.peek());
    }

    public void imprimirTamanhoLista() {
        System.out.println("O tamanho da sua pilha é: " + pilha.size());
    }

    public void imprimirLista() {
        for (String s : pilha) {
            System.out.println(s);
        }
    }

    public void exibirLifo() {
        for (int i = pilha.size() - 1; i >= 0; i--) {
            System.out.println(pilha.get(i));
        }
    }

    public void removerNaLista() {
        pilha.pop();
    }
}
