package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double l1 = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double l2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double l3 = sc.nextDouble();

        if (l1 == l2 && l2 == l3) {
            System.out.print("É um Triângulo Equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.print("Triângulo Isósceles");
        } else {
            System.out.print("Triângulo Escaleno");
        }

        sc.close();
    }

}
