package br.com.alexjr.empresa;

public class GerenciaRH {

    private ConexaoBancaria conexaoBancaria;

    public GerenciaRH(ConexaoBancaria conexaoBancaria) {
        this.conexaoBancaria = conexaoBancaria;
    }

    public void pagarBonificacaoAnual(Funcionario funcionario) {
        double bonificao = funcionario.calcularBonificacaoAnual();
        conexaoBancaria.enviarPagamento(funcionario.getCpf(),  bonificao);
        enviarEmail();
    }

    private void enviarEmail(){
        System.out.println("Email enviado");
    }
}
