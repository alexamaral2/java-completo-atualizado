package br.com.alexjr.empresa;

public class Gerente extends Funcionario {

    @Override
    public double calcularBonificacao() {
        double bonificacaoPadrao = super.calcularBonificacao();
        return bonificacaoPadrao + 500;
    }

    @Override
    public double calcularBonificacaoAnual() {
        return getSalario() * 3;
    }
}

