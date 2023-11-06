package fixacao;
//Elaborar um programa que leia 8 números inteiros e exiba quantos são maiores que a média desses valores.

import java.util.Scanner;

public class exer_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[8]; // vetor com 8 elementos
        int soma = 0; // variável para calcular a soma

        System.out.println("digite 8 números:");

        for (int i = 0; i < 8; i++) {
            num[i] = scanner.nextInt();
            soma += num[i]; // coma os números para calucula a média posteriormente
        }

        double media = soma / 8.0; // calcula a média dos números
        int contador = 0; // ver a quantidade de números que são maiores que a média

        for (int i = 0; i < 8; i++) {
            if (num[i] > media) {
                contador++;
            }
        }
        System.out.println("A média é: " + media); // exobe a média calculada
        System.out.println("Numeros maiores que a média: " + contador); // exibe a quantidade de números maiores q a
                                                                        // média
    }
}
