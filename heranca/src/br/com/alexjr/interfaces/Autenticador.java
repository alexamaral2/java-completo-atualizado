package br.com.alexjr.interfaces;

public class Autenticador {

    public boolean autenticar(Autenticacao autenticacao) {
        String identificacao = autenticacao.getIdentificacao();

        if(autenticacao.isUsaSenha()){
            String senha = autenticacao.getSenha();
            return true;
        } else {
            return true;
        }
    }
}
