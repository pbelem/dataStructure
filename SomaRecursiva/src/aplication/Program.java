package aplication;

import java.util.Scanner;

public class Program {

    public static int somaRecursiva(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + somaRecursiva(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int resultado = somaRecursiva(N);
            System.out.println("A soma dos números de 1 até " + N + " é: " + resultado);
        }

        scanner.close();
    }
}