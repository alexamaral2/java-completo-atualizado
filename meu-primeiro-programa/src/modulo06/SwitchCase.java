package modulo06;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valorTotal = 0.0;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Sanduíche");
            System.out.println("2 - Pizza");
            System.out.println("3 - Sorvete");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você pegou um sanduíche (R$ 10,00) ");
                    valorTotal += 10;
                    break;
                case 2:
                    System.out.println("Você pegou uma pizza (R$ 30,00) )");
                    valorTotal += 30;
                    break;
                case 3:
                    System.out.println("Você pegou um sorvete (R$ 5,00) )");
                    valorTotal += 5;
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        System.out.println("O total do seu pedido é R$ " + valorTotal);

        scanner.close();
    }
}
