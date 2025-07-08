package modulo07.exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        String[] pessoas = {"Alex", "Ana", "Lucio", "Augusto"};

        for(int index = pessoas.length - 1; index >= 0; index--){
            System.out.println(pessoas[index]);
        }
    }
}
