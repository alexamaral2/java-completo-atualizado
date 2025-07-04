package modulo05;

public class ContadorNumerosPares {
    public static void main(String[] args) {
        for(int contador = 0; contador <= 100; contador += 2){
            if(contador % 2 == 0){
                System.out.println(contador);
            }
        }
    }
}
