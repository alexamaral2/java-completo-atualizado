package br.com.alexjr.empresa;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Fulano de Tal");
        tecnico.setSalario(1500);
        tecnico.setCpf("111.222.333-44");

        tecnico.imprimirRemuneracao();

        Gerente gerente = new Gerente();
        gerente.setNome("Gerentão");
        gerente.setSalario(3000);
        gerente.setCpf("444.333.222-11");

        gerente.imprimirRemuneracao();
    }
}
