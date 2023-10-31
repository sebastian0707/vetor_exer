//Elaborar um programa que leia um vetor com 20 números inteiros. 
//Escreva os elementos do vetor eliminando elementos repetidos.

import java.util.Scanner;

public class exer_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20]; // vetor com 20 elementos
        int[] vetorSemRepetir = new int[20]; // armarzenar os elmentos que não repetem

        System.out.println("20 números inteiros: ");

        // le o numeros e armazena no vetor[]
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }

        // contador para o vetorSemRepetir
        int contador = 0;

        // Verifica se cada elemento do vetor já foi adicionado ao vetorSemRepetir
        for (int i = 0; i < 20; i++) {
            boolean repetido = false;

            for (int j = 0; j < 20; j++) {
                if (vetor[i] == vetorSemRepetir[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                vetorSemRepetir[contador] = vetor[i];
                contador++;
            }
        }

        // imprimir vetorSemRepetir
        System.out.println("Elementos sem repetir: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(vetorSemRepetir[i] + " ");
        }

    }
}
