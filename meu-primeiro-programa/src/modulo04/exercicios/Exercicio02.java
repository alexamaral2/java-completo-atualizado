package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        double quadradoNumero = Math.pow(numero, 2);
        System.out.println("O quadrado do numero é: " + quadradoNumero);

        sc.close();
    }
}
