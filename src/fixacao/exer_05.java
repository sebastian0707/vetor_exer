package fixacao;

import java.util.Scanner;

//Leia um vetor A, com 10 elementos. Crie em vetor B da seguinte forma:
//
//coloque os números pares primeiro;
//coloque os números ímpares logo após os pares;
//exiba o vetor B.
public class exer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criar o vetor A com 10 elementos
        int A[] = new int[10];
        // vetor B com 10 elementos
        int B[] = new int[10];

        // ler os valores para o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor do vetor A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // índices para números pares e ímpares em B
        int ParB = 0;
        int ImparB = 0;

        // vetor B com números pares seguidos pelos ímpares
        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) { // Se o número é ímpar
                B[ParB] = A[i];
                ParB++;
            } else { // Se o número é impar
                B[5 + ImparB] = A[i];
                ImparB++;
            }
        }
        // Exibindo o vetor B
        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }

    }
}
