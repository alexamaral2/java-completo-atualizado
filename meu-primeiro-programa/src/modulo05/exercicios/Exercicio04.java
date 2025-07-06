package modulo05.exercicios;

public class Exercicio04 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean isPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println(i + " é primo");
            }
        }
    }
}
