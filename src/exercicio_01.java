//Elaborar um programa que leia 8 números inteiros e exiba quantos são maiores que a média desses valores.

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[8];
        int soma = 0;

        System.out.println("digite 8 números: \n");

        for (int i = 0; i < 8; i++){
            num[i] = scanner.nextInt();
            soma += num[i];
        }

        double media = soma / 8.0;
        int contador = 0;

        for (int i = 0; i < 8; i++){
            if (num[i] > media){
                contador++;
            }
        }
        System.out.println("A média é: "+ media);
        System.out.println("Numeros maiores que a média: " + contador);
    }
}
