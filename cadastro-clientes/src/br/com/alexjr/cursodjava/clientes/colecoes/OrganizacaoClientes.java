package br.com.alexjr.cursodjava.clientes.colecoes;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.enums.TipoSexo;

import java.util.*;
import java.util.stream.Collectors;

public class OrganizacaoClientes {

    private Map<TipoSexo, List<Cliente>> mapa;

    public OrganizacaoClientes() {
        this.mapa = new HashMap<>();
    }

    public void adicionar(Cliente cliente) {
        boolean jaContemSexo = mapa.containsKey(cliente.getSexo());

        if (jaContemSexo) {
            List<Cliente> clientes = mapa.get(cliente.getSexo());
            clientes.add(cliente);
        } else {
            List<Cliente> clientes = new ArrayList<>();
            clientes.add(cliente);
            mapa.put(cliente.getSexo(), clientes);

        }
    }

    public List<Cliente> buscarPorSexo(TipoSexo tipo) {
        return mapa.get(tipo);
    }

    public List<TipoSexo> obterTiposAdicionados(){
        Set<TipoSexo> tipoSexos =  mapa.keySet();
        return new ArrayList<>(tipoSexos);
    }

    public void imprimirClientes(TipoSexo tipo){
        List<Cliente> clientes = mapa.get(tipo);

        if(clientes != null){
            for (Cliente cliente : clientes) {
                System.out.println(cliente.getNome());
            }
        } else {
            System.out.println("Nenhum cliente encontrado");
        }

    }
}
