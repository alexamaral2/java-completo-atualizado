package modulo04.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        double temperaturaCelsius = sc.nextInt();

        double converterFahrenheit =  (temperaturaCelsius * 1.8) + 32;

        System.out.print("Temperatura em °F: " + converterFahrenheit);

        sc.nextLine();

    }
}
