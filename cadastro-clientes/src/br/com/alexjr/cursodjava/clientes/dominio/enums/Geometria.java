package br.com.alexjr.cursodjava.clientes.dominio.enums;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;

public class Geometria {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = FormaGeometrica.CIRCULO;
        int ladosRetangulo = formaGeometrica.getLados();
        System.out.println(ladosRetangulo);

        Object formaGeometrica2 = FormaGeometrica.QUADRADO;

        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");

        Cliente outroCliente = new Cliente();
        cliente.setNome("Fulano");

        System.out.println(cliente.hashCode());
        System.out.println(outroCliente.hashCode());

    }
}
