package modulo07.exercicios;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for(int index = 0; index <= 9; index++){
           numeros[index] = (int) (Math.random() * 101);
        }

        int indicePar = -1;
        for(int index = 0; index <= 9; index++){
            if(numeros[index] % 2 == 0){
                indicePar = index;
                break;
            }
        }

        if (indicePar != -1){
            System.out.println("O indice do primeiro número par: " + indicePar);
        } else {
            System.out.println("Não há número par no array!");
        }
    }
}
