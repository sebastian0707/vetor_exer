package fixacao;
//Ler dois conjuntos de números reais, armazenando-os em vetores e calcular o produto escalar entre eles. 

//Os conjuntos tem 5 elementos cada. 
//Imprimir os dois conjuntos e o produto escalar, sendo que o produto escalar e dado por: x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn.

import java.util.Scanner;

public class exer_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetorX = new double[5]; // vetor do primeiro conjunto
        double[] vetorY = new double[5]; // vetor do segundo conjunto

        // ler o primeiro conjunto
        System.out.println("escreva 5 números para o primeiro conjunto:");
        for (int i = 0; i < 5; i++) {
            vetorX[i] = scanner.nextDouble();
        }

        // ler o segundo conjunto seguindo a mesma línea de raciocíneo
        System.out.println("escreva 5 números para o segundo conjunto:");
        for (int i = 0; i < 5; i++) {
            vetorY[i] = scanner.nextDouble();
        }

        // calcular o produto escalar
        double produtoEscalar = calculoProdutoEscalar(vetorX, vetorY);

        // imprimir os conjuntos e o produto escalar
        System.out.println("\nprimeiro conjunto: ");
        imprimirVetor(vetorX);

        System.out.println("\nsegundo conjunto: ");
        imprimirVetor(vetorY);

        System.out.println("\nProduto Escalar: " + produtoEscalar);
    }

    // calculo do produto escalar
    public static double calculoProdutoEscalar(double[] vetorX, double[] vetorY) {
        double produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetorX[i] * vetorY[i];
        }
        return produtoEscalar;
    }

    // metodo para imprimir o vetor de números reais
    public static void imprimirVetor(double[] vetor) {
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}

// o programa deve ler dois conjuntos de núemros reais, ele tem q calucular o
// produto escalar e imprime os
// conjutos e o resultado
