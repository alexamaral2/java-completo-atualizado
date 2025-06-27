package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCompra = 0.0;

        System.out.print("Digite a quantidade de maçãs que deseja comprar: ");
        int qtdMaca = sc.nextInt();

        if (qtdMaca >= 12) {
            totalCompra = qtdMaca * 0.25;
        } else {
            totalCompra = qtdMaca * 0.30;
        }

        System.out.println("O total de compra:  R$ " + totalCompra);

        sc.close();
    }
}
