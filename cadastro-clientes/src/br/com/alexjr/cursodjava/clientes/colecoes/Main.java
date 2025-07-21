package br.com.alexjr.cursodjava.clientes.colecoes;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Ciclano");
        cliente2.setSexo(TipoSexo.M);

        listaClientes.add(cliente);
        listaClientes.add(cliente2);

        System.out.println(listaClientes.size());

        for (Cliente c: listaClientes) {
            System.out.println(c);
        }
    }

    private static void repositorioComArray(){
        RepositorioCliente repositorioClientes = new RepositorioCliente();
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Ciclano");
        cliente2.setSexo(TipoSexo.M);

        repositorioClientes.adicionar(cliente);
        repositorioClientes.adicionar(cliente2);
        repositorioClientes.imprimirClientes();
    }
}
