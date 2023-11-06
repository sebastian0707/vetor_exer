package fixacao;

import java.util.Scanner;

public class exer_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunoAlto = 0;
        int numAlunoBaixo = 0;
        double alturaAlto = Double.MAX_VALUE;
        double alturaBaixo = Double.MIN_VALUE;

        for (int i = 1; i < 10; i++) {
            System.out.println("digite o número do aluno " + i + ":");
            int numAluno = scanner.nextInt();

            System.out.println("digite a altura do aluno " + i + "(em metros):");
            double altura = scanner.nextDouble();

            if (altura > alturaAlto) {
                alturaAlto = altura;
                numAlunoAlto = numAluno;
            }

            if (altura < alturaBaixo) {
                alturaBaixo = altura;
                numAlunoBaixo = numAluno;
            }
        }

        System.out.println("aluno mais alto:");
        System.out.println("número do aluno: " + numAlunoAlto);
        System.out.println("altura: " + alturaAlto + "metros");

        System.out.println("aluno mais baixo");
        System.out.println("número do aluno: " + numAlunoBaixo);
        System.out.println("altura: " + alturaBaixo + " metros");

        scanner.close();
    }
}
