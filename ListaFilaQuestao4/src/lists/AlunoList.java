package lists;

import entities.Aluno;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AlunoList {
Scanner input = new Scanner(System.in);
    Queue<Aluno> fila = new LinkedList<>();

    public void InserirAlunos(Aluno aluno1) {
        //nn consegui fazer ordenando por idade mas vou tentar dnv dps, vi que tem uma forma
        // nativa do java pra fazer isso mas vou tentar fazer por lógica mesmo que aprende melhor
        System.out.println("Informe o nome do aluno: ");
        String nome = input.nextLine();
        System.out.println("Informe a idade do aluno: ");
        int idade = input.nextInt();
        input.nextLine();
        Aluno aluno = new Aluno(nome, idade);
        fila.add(aluno);
    }

    public void ConsultarAlunos() {
        Iterator<Aluno> it = fila.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

