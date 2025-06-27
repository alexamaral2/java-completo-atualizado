package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double b = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double h = sc.nextDouble();

        double p = 2 * (b + h);
        double a = b * h;

        System.out.printf("Área do retângulo: %.2f%n", a);
        System.out.printf("Perímetro do retângulo: %.2f%n", p);

        sc.close();
    }
}
