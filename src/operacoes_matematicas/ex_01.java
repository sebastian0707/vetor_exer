package operacoes_matematicas;

public class ex_01 {

    // Função para somar os elementos de um vetor de inteiros
    public static int vetorSomaInt(int[] V) {
        int soma = 0;
        for (int valor : V) {
            soma += valor;
        }
        return soma;
    }

    // Função para somar os elementos de um vetor de ponto flutuante
    public static double vetorSomaFloat(double[] V) {
        double soma = 0.0;
        for (double valor : V) {
            soma += valor;
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] vetorInt = { 2, 3, 5 };
        double[] vetorDouble = { 1.5, 3.7, };

        // Chamando a função vetorSomaInt e armazenando o resultado em somaInt
        int somaInt = vetorSomaInt(vetorInt);

        // Chamando a função vetorSomaFloat e armazenando o resultado em somaFloat
        double somaFloat = vetorSomaFloat(vetorDouble);

        System.out.println("soma dos valores inteiros: " + somaInt);
        System.out.println("soma dos valores reais: " + somaFloat);
    }
}
