package modulo07.exercicios;

public class Exercicio08 {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,12,10};

        boolean arrayOrdenado = true;
        for (int i = 0; i < numeros.length - 1; i++) {
            if(numeros[i] > numeros[i+1]){
                arrayOrdenado = false;
            }
        }

        if (arrayOrdenado == true){
            System.out.println("Array ordenado");
        } else {
            System.out.println("Array não ordenado");
        }
    }
}
