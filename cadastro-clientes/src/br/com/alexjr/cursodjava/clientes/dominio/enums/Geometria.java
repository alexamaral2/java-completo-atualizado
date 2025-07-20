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
        cliente.setCpf("1234567890");

        Cliente outroCliente = new Cliente();
        outroCliente.setNome("Cicrano");
        outroCliente.setCpf("0987654321");

        System.out.println(cliente.hashCode());
        System.out.println(outroCliente.hashCode());

        int numero1 = 10;
        int numero2 = 10;

        String cliente1 = new String("cliente");
        String cliente2 = new String("cliente");

        System.out.println("Eles são iguais? " + (cliente.getCpf().equals(outroCliente.getCpf())));
        System.out.println("Eles são iguais? " + (cliente1.equals(cliente2)));

    }
}
