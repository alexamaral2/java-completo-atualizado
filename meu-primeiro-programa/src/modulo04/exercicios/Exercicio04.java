package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.print("O número é positivo");
        } else if (numero < 0) {
            System.out.print("O número é negativo");
        } else {
            System.out.print("O número é zero");
        }
        sc.close();
    }
}
