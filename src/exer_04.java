import javax.sound.midi.SysexMessage;
import java.util.Scanner;

//Elaborar um programa que leia 6 números e exiba:
//
//o maior número lido;
//o menor número lido;
//quantos números são iguais ao primeiro número.
public class exer_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //criar 6 elementos
        int[] num = new int[6];

        //ler os números e armazenando no vetor
        for(int i = 0; i < 6; i++){
            System.out.println("Digite o número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        //armazenar varíaveis de maior e menor número
        int maior = num[0];
        int menor = num[0];

        //utilizando um contdor para ver quantos números são iguais ao primeiro número
        int contador = 0;

        //passando pelos vetor para encontrar o maior, menor e contar os iguais ao primeiro número
        for (int i = 0; i < 6; i++){
            if (num[i] > maior){
                maior = num[i];
            }
            if (num[i] < menor){
                menor = num[i];
            }
            if (num[i] == num[0]){
                    contador++;
            }
        }
        //maior numero
        System.out.println("O maior número é: " + maior);

        //menor numero
        System.out.println("O menor número é: " + menor);

        //quantidade de numeros iguais ao primeiro número
        System.out.println("Números iguais ao primeiro núemro é: " + contador);
    }
}
