package fixacao;
//Elaborar um programa que leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.

import java.util.Scanner;

public class exer_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10]; // cria um vetor com 10 posições

        System.out.println("digitar 10 números:");

        // armazenar os números no vetor
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        int contadorPar = 0; // inicia do caontador para os pares

        // quantos valores no vetor são pares
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPar++;
            }
        }

        // exibir a quantidade de valores pares
        System.out.println("Valores pares no total: " + contadorPar);
    }

}
