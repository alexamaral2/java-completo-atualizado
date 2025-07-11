package br.com.alexjr.empresa;

public class Gerente extends Funcionario{

    @Override
    public double calcularBonificacao(){
        double bonificaoPadrao = super.calcularBonificacao();
        double remuneracaoGerente = bonificaoPadrao + 500;
        return remuneracaoGerente;
    }
}
