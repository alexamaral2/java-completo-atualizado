package br.com.alexjr.interfaces;

public interface CarroCombustao {
    void abastecer();
    
    default void fazAlgo(){
        System.out.println("Faz algo!");
    }
}
