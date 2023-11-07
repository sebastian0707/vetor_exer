package fixacao;

import java.util.Scanner;

public class exer_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10]; // vetor para armazenar os números
        int indice = 0; // índice para controlar a posição no vetor

        System.out.println("digite 10 numeros entre 0 e 100: ");

        // loop para ler os números
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();

            // verificar se o número já foi lido anteriormente
            boolean duplicata = false;
            for (int j = 0; j < indice; j++) {
                if (num[j] == numero) {
                    duplicata = true;
                    break;
                }
            }

            // se n for uma duplicata, armazena no veotr e incrementa o índice
            if (!duplicata) {
                num[indice] = numero;
                indice++;
            }
        }

        // imprime os números sem duplicatas
        System.out.println("numeros sem duplicatas: ");
        for (int i = 0; i < indice; i++) {
            System.out.println(num[i] + " ");
        }
    }
}
