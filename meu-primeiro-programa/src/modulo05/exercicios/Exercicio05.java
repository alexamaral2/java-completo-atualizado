package modulo05.exercicios;

public class Exercicio05 {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 100) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (contador % 3 == 0) {
                System.out.println("Fizz");
            } else if (contador % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
