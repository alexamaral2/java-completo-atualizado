package br.com.alexjr.cursodjava.clientes;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println(cliente.getCodigo());

    }
}
