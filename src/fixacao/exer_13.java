package fixacao;

import java.util.Scanner;

public class exer_13 {
    public static void main(String[] args) {

        // abrir o scanner
        Scanner scanner = new Scanner(System.in);

        int numAlunoAlto = 0; // número do aluno mais alto
        int numAlunoBaixo = 0; // numero do aluno mais baixo
        double alturaAlto = Double.MAX_VALUE; // altura do aluno mais alto (inicializando pelor maior valor possível)
        double alturaBaixo = Double.MIN_VALUE; // altura do aluno mais baixo (inicializando pelor menor valor possível)

        for (int i = 1; i < 10; i++) {
            System.out.println("digite o número do aluno " + i + ":");
            int numAluno = scanner.nextInt(); // lê o número do aluno

            System.out.println("digite a altura do aluno " + i + "(em metros):");
            double altura = scanner.nextDouble(); // lê a altura do aluno

            if (altura > alturaAlto) {
                alturaAlto = altura; // atualiza a altura do aluno mais alto
                numAlunoAlto = numAluno; // atualizado o número do aluno mais alto
            }

            if (altura < alturaBaixo) {
                alturaBaixo = altura; // atualiza a altura do aluno mais baixo
                numAlunoBaixo = numAluno; // atualiza o número do aluno mais baixo
            }
        }

        // imprime o aluno mais alto
        System.out.println("aluno mais alto:");
        System.out.println("número do aluno: " + numAlunoAlto);
        System.out.println("altura: " + alturaAlto + "metros");

        // imprime o aluno mais baixo
        System.out.println("aluno mais baixo");
        System.out.println("número do aluno: " + numAlunoBaixo);
        System.out.println("altura: " + alturaBaixo + " metros");

        // fechar o scanner
        scanner.close();
    }
}
