package fixacao;

import java.util.Scanner;

public class exer_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criar vetores A B C
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        // receber valores do vetor A
        System.out.println("digite os 10 valores para o vetor A: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("valor " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        // receber valores do vetor B
        System.out.println("digite os 10 valores para o vetor B: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("valor " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        // calcular o C = A - B
        for (int i = 0; i < 10; i++) {
            C[i] = A[i] - B[i];
        }

        // valores do vetor C
        System.out.println("vetor C (A - B):");
        for (int i = 0; i < 10; i++) {
            System.out.println("C [" + i + "] = " + C[i]);
        }

        scanner.close();
    }
}

// Este programa permite que o usuário insira 10 valores para os vetores A e B,
// e em seguida calcula e exibe o vetor C resultante da subtração.