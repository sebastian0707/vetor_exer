package fixacao;
//Leia dois vetores VA e VB de 10 posições cada um, contendo valores inteiros.

//Em seguida, gere um vetor VC com 20 posições, contendo os valores de VA nas posições pares e os valores de VB nas posições ímpares

public class exer_02 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vetorB = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int[] vetorC = new int[20];

        for (int i = 0; i < 10; i++) {
            vetorC[i * 2] = vetorA[i];

            vetorC[i * 2 + 1] = vetorB[i];
        }

        System.out.print("Vetor C: \n");
        for (int i = 0; i < 20; i++) {
            System.out.println(vetorC[i] + " ");
        }
    }

}
