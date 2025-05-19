package usandoPilha;

import java.util.Iterator;

import java.util.Stack;


public class UsandoPilha {


    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        System.out.println("Vamos adicionar dados nessa lista!");

        pilha.push(10);//classe stack
        pilha.push(20);
        pilha.push(30);
        pilha.add(40);//classe vector
        pilha.addElement(50);//classe vector

        if (pilha.isEmpty()) {
            System.out.println("Sua pilha esta vazia!");
        } else {
            System.out.println("Sua pilha tem dados");
        }

        System.out.println("O topo da sua pilha é " + pilha.peek());

        pilha.pop();

        System.out.println("O topo da sua pilha é " + pilha.peek());

        System.out.println("O tamanho da sua pilha é: " + pilha.size());

        Iterator<Integer> it = pilha.iterator();
        while (pilha.iterator().hasNext()) {
            System.out.println(it.next());
        }

    }

}