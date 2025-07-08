package modulo07.exercicios;

public class Exercicio07 {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        int[] array3 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}
