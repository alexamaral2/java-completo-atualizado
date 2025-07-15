package br.com.alexjr.interfaces;

public interface CarroEletrico {
    void carregarBateria();
    int VELOCIDADE_MAXIMA = 150;

    static void imprimirAlgo(){
        System.out.println("Faz algo!");
    }

    default void fazAlgo(){
        System.out.println("Faz algo!");
    }
}
