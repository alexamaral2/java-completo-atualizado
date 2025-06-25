package modulo04;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);
        leitorTeclado.useLocale(Locale.US);

        System.out.println("Digite seu peso (em kilogramas): ");
        float peso = leitorTeclado.nextFloat();

        System.out.println("Digite sua altura (em centimetros): ");
        float altura = leitorTeclado.nextFloat();

        float resultado = peso / (altura * altura);

        System.out.println("O IMC para o peso " + peso + ", e altura "
                + altura + " é " + resultado);

        leitorTeclado.close();
    }
}
