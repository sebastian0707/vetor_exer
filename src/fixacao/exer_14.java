package fixacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exer_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] N = new double[5]; // armazenando em um vetor N os 5 alunos
        ArrayList<Integer> P = new ArrayList<>(); // ArrayList para armazenar as posiç~ções dos alunos com notas acima
                                                  // da média
        double soma = 0;

        // ler as notas
        for (int i = 0; i < 5; i++) {
            System.out.println("digite a nota do aluno " + (1 + i) + ": ");
            N[i] = scanner.nextDouble();
            soma += N[i]; // acumular a soma das notas
        }

        double media = soma / 5; // calucular a média das notas

        // identifica e armazena as posições do alunos com notas acima da média
        for (int i = 0; i < 5; i++) {
            if (N[i] > media) {
                P.add(i);
            }
        }

        Collections.sort(P); // ordenar o ArrayList em ordem crescente

        // imprime a média
        System.out.println("media das notas dos alunos aprovados: " + media);

        // imprime as posições dos alunos com notas acima da média
        System.out.println("posições dos alunos com notas acima da média: ");
        for (int posicao : P) {
            System.out.println(posicao + " ");
        }
    }
}
