package modulo05;

import java.util.Scanner;

public class LoopComFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        for (int contador = 1; contador <= valor; contador++){
            System.out.println(contador);
        }

        sc.close();
    }
}
