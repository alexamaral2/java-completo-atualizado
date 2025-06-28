package modulo05;

import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int contador = sc.nextInt();
        int valor = 2;

        while (valor <= contador){
            if (valor % 2 == 0){
                System.out.println(valor);
            }
            valor++;
        }

        sc.close();
    }
}
