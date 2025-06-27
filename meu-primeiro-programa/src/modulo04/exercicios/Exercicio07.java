package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int calcularIdade =  (anoAtual - anoNascimento);

        if (calcularIdade >= 18) {
            System.out.println("Poderá votar este ano.");
        } else {
            System.out.println("Não poderá votar este ano.");
        }

        sc.close();
    }
}
