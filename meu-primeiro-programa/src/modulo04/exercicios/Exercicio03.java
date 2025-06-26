package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int valor2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int valor3 = sc.nextInt();

        double media = (double) (valor1 + valor2 + valor3) / 3;

        System.out.printf("A média é: %.2f", media);

        sc.close();
    }
}
