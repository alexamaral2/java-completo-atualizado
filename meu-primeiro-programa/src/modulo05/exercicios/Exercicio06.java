package modulo05.exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero = 1234;
        int soma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            soma += digito;
            numero /= 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }
}