package modulo05;

import java.util.Scanner;

public class MenuDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Digite uma opçãp do menu: ");
            System.out.println("1. Sanduiche");
            System.out.println("2. Pizza");
            System.out.println("3. Sorvete");
            System.out.println("0. Sair");

            opcao = sc.nextInt();

            if (opcao == 0){
                System.out.println("Saindo do sistema...");
            } else if (opcao == 1){
                System.out.println("Você pegou um sanduiche");
            } else if (opcao == 2){
                System.out.println("Você pegou um pizza");
            } else if (opcao == 3){
                System.out.println("Você pegou um sorvete");
            } else if (opcao == 0){
                System.out.println("Saindo do sistema...");
            }
        } while (opcao != 0);

        sc.close();
    }
}
