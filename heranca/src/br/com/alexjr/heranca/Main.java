package br.com.alexjr.heranca;

public class Main {
    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.setNome("Panda");
        panda.setIdade(50);
        panda.imprimirDados();

        Hipopotamo hipopotamo = new Hipopotamo();
        hipopotamo.setNome("Hipopotamo");
        hipopotamo.setIdade(30);
        hipopotamo.imprimirDados();
    }
}
