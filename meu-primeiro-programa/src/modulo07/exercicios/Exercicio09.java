package modulo07.exercicios;

public class Exercicio09 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int soma = 0;
        int contador = 0;

        System.out.print("Números sorteados: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 51);
            System.out.print(numeros[i] + " ");

            if (numeros[i] > 25) {
                soma += numeros[i];
                contador++;
            }
        }

        System.out.println();

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos números maiores que 25: " + media);
        } else {
            System.out.println("Não há números maiores que 25 para calcular a média!");
        }
    }
}
