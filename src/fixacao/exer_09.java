package fixacao;
//Elaborar um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 

//Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
//Caso, o código for diferente de 1 e 2 escreva uma mensagem informando que o código é inválido.

import java.util.Scanner;

public class exer_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[5]; // vetor de 5 posições com números reais

        System.out.println("5 números reais: ");

        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("digite um código (0 para sair, 1 para ordem direta, 2 para ordem inversa): ");
        int codigo = scanner.nextInt(); // ler o código

        // utilizar o método switch
        switch (codigo) {
            case 0:
                System.out.println("programa finalizado.");
                break;

            case 1:
                System.out.println("ordem direta do vetor:");
                imprimirVetor(vetor); // método de chamado para imprimir o vetor
                break;

            case 2:
                System.out.println("ordem inversa do vetor:");
                VetorInverso(vetor); // método de chamado para imrpimir o vetor no inverso
                break;

            default:
                System.out.println("código inválido. programa finalizado");
        }
    }

    // imprimir o vetor na ordem direta
    public static void imprimirVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + "");
        }
    }

    // imprimir o vetor na ordem inversa
    public static void VetorInverso(double[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
