package br.com.alexjr.outropacote;

import br.com.alexjr.heranca.Animal;

public class Cachorro extends Animal {

    public Cachorro(int idade) {
        super("Cachorro", idade);
    }

    public void latir(){
        imprimirDados();
    }
}
