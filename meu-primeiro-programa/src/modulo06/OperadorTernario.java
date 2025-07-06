package modulo06;

public class OperadorTernario {
    public static void main(String[] args) {

        int idade = 20;
        int idadeMinima = 10;
        int anoNascimento = 2000;

        if (idade > idadeMinima && anoNascimento >= 2000 && idadeMinima < 20) {
            System.out.println("Executa o IF com a lógica do E.");
        }

        if (idade > idadeMinima || anoNascimento >= 2000) {
            System.out.println("Executa essa lógica do OU.");
        }

        String maiorIdade = idade >= 18 ? "Sim, é maior de idade" : "Não, é menor de idade";
        System.out.println(maiorIdade);
    }
}
