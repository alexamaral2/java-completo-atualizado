package modulo04.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double pesoIdeal;

        System.out.print("Digite o sexo da pessoa (m para masculino / f para feminino): ");
        char sexo = sc.next().toLowerCase().charAt(0);

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = sc.nextDouble();

        if (sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);
        sc.close();
    }
}
