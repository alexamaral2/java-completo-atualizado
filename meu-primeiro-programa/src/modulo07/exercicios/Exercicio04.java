package modulo07.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int index = 0; index <= 4; index++){
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            numeros[index] = numero;
        }

        for(int numero : numeros){
            System.out.println(numero);
        }

        sc.close();
    }
}
