package modulo07.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do Array: ");
        int tamanhoArray = sc.nextInt();

        int[] numero = new int[tamanhoArray];

        for(int index = 0; index < tamanhoArray; index++){
            System.out.print("Digite um numero: ");
            numero[index] = sc.nextInt();
        }

        for(int index = 0; index < tamanhoArray; index++){
            System.out.println(numero[index]);
        }
        sc.close();
    }
}
