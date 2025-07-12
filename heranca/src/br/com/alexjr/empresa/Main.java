package br.com.alexjr.empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario tecnico = new Tecnico();
        tecnico.setNome("Fulano de Tal");
        tecnico.setSalario(1500);
        tecnico.setCpf("111.222.333-44");

        tecnico.imprimirRemuneracao();

        Funcionario gerente = new Gerente();
        gerente.setNome("Gerentão");
        gerente.setSalario(3000);
        gerente.setCpf("444.333.222-11");

        gerente.imprimirRemuneracao();

        System.out.println("Bonus anual: ");
        System.out.println("Gerente: " + gerente.calcularBonificacaoAnual());
        System.out.println("Tecnico: " + tecnico.calcularBonificacaoAnual());

        ConexaoBancaria conexaoBancaria = new ConexaoBancaria();
        GerenciaRH gerenciaRH = new GerenciaRH(conexaoBancaria);
        gerenciaRH.pagarBonificacaoAnual(gerente);
        gerenciaRH.pagarBonificacaoAnual(tecnico);
    }
}
