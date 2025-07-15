package br.com.alexjr.interfaces;

public class CredencialBiometrica implements Autenticacao {
    private byte[] fotoRosto;
    private String senha;

    public CredencialBiometrica(byte[] fotoRosto) {
        this.fotoRosto = fotoRosto;
    }

    @Override
    public String getIdentificacao() {
        return new String(this.fotoRosto);
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public boolean isUsaSenha() {
        return true;
    }
}
