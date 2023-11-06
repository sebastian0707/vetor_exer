package fixacao;
//Elaborar um programa que leia um vetor C de 10 elementos inteiros. Após o término da leitura, trocar todos os valores negativos do vetor C por 0.

// Após todas as trocas terem sido efetuadas, escrever o novo vetor C.

import java.util.Scanner;

public class exer_03 {
    public static void main(String[] args) {

        // entrada do usuário com método Scanner
        Scanner scanner = new Scanner(System.in);

        // criar 10 vetores
        int[] vC = new int[10];

        // ler valores do vC
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor para o Vetor C[" + i + "]: ");
            vC[i] = scanner.nextInt();
        }
        // valores negativos trocados por 0
        // loop do i menor que 10 em aumento e SE o vetorC for menor que 0, o vetor muda
        // para o valor 0
        for (int i = 0; i < 10; i++) {
            if (vC[i] < 0) {
                vC[i] = 0;
            }
        }

        // imprimir o novo vetor C
        System.out.println("Novo vetor C: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + vC[i]);
        }
    }
}
