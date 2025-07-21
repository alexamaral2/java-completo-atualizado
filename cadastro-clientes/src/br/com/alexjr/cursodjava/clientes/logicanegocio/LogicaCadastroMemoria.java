package br.com.alexjr.cursodjava.clientes.logicanegocio;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;

import java.util.List;
import java.util.UUID;

public class LogicaCadastroMemoria implements Cadastro<Cliente> {

    private List<Cliente> lista;

    @Override
    public void salvar(Cliente objetoCadastrar) {

    }

    @Override
    public Cliente buscar(UUID codigo) {
        return null;
    }

    @Override
    public void deletar(UUID codigo) {

    }

    @Override
    public void atualizar(Cliente objetoAtualizar) {

    }
}
