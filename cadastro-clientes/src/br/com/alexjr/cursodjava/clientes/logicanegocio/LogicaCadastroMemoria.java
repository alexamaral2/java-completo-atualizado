package br.com.alexjr.cursodjava.clientes.logicanegocio;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.exceptions.CpfInvalidoException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LogicaCadastroMemoria implements Cadastro<Cliente> {

    private List<Cliente> lista;

    public LogicaCadastroMemoria() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void salvar(Cliente cliente) throws CpfInvalidoException {
        ValidadorCliente.validar(cliente);
        this.lista.add(cliente);
    }

    @Override
    public Cliente buscar(UUID codigo) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : lista) {
            if (cliente.getCodigo().equals(codigo)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

    @Override
    public void deletar(UUID codigo) {
        Cliente clienteEncontrado = this.buscar(codigo);
        if (clienteEncontrado != null) {
            this.lista.remove(clienteEncontrado);
        }
    }

    @Override
    public void atualizar(Cliente cliente) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(cliente.getCodigo())) {
                lista.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public void imprimirRegistros() {
        System.out.println("Imprimindo " + this.lista.size() + " cliente(s)");
        for (Cliente cliente : this.lista) {
            System.out.println(cliente);
        }
    }
}
