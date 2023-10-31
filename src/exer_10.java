//Elaborar um programa com um vetor de tamanho 10 preenchido com o seguinte valor:(i + 5i) % (i+1), 
//sendo que i a posição do elemento no vetor. Em seguida imprima o vetor na tela.

public class exer_10 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        // preencher o vetor de acordo com a fórmula (i + 5i) % (i+1)
        for (int i = 0; i < 50; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
        }

        // imprimir o vetor
        System.out.println("vetor: ");
        for (int i = 0; i < 50; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}

// foi criado um vetor de tamanho 50 e os valores foram geradoas pela fórmula e
// imprime o vetor
