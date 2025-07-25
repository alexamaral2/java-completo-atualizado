package modulo07;

public class InteracaoComArrays {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
            if(index % 2 == 0){
                System.out.println("O número é par.");
            }
        }

        String[] emails = new String[5];
        emails[0] = "fulano@email.com";
        emails[1] = "cicrano@email.com";
        emails[2] = "alex@email.com";
        emails[3] = "larissinha@email.com";
        emails[4] = "pedrinho@email.com";

        for (int i = 0; i<emails.length; i++){
            System.out.println(emails[i]);
        }

        System.out.println();
        System.out.println("Foreach");

        for (String email: emails){
            System.out.println(email);

        }
    }
}
