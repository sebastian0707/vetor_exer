//Ler um conjunto de números reais, armazenando-o em vetor e calcular o quadrado das componentes deste vetor, armazenando o resultado em outro vetor.
//Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos.

import java.util.Scanner;

public class exer_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetorOg = new double[10];
        double[] vetorQuadado = new double[10];

        // lê os numeros reais e armazena no vetorOG
        System.out.println("digite 10 números reais: ");
        for (int i = 0; i < 10; i++) {
            vetorOg[i] = scanner.nextDouble();
        }

        // calcula o quadrado de cada componente e armazena no vetorQuadrado
        for (int i = 0; i < 10; i++) {
            vetorQuadado[i] = Math.pow(vetorOg[i], 2); // Math.pow(x , 2) é usado para calcular o quadrado de um número
                                                       // "x"
        }

        // imprimir os vetores
        System.out.println("Vetor Original: ");
        imprimirVetor(vetorOg);

        System.out.println("\nVetor Quadrado: ");
        imprimirVetor(vetorQuadado);
    }

    // metodo para imprimir um vetor de numeros reais
    public static void imprimirVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
