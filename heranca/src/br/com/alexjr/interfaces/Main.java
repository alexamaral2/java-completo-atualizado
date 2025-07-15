package br.com.alexjr.interfaces;

public class Main {
    public static void main(String[] args) {

        CarroEletrico.imprimirAlgo();

        CarroHibrido carroHibrido = new CarroHibrido();

        Autenticador autenticador = new Autenticador();

        Autenticacao email = new CredencialEmail("email@fulano.com", "321");
        boolean isAutenticado = autenticador.autenticar(email);


        Autenticacao usuario = new CredencialLogin("username", "password");
        boolean isUsuarioAutenticado = autenticador.autenticar(usuario);


        Autenticacao biometria = new CredencialBiometrica(new byte[]{});
        boolean isBiometriaAutenticada = autenticador.autenticar(biometria);
    }
}
