package br.com.alexjr.cursodjava.clientes.logicanegocio;

import br.com.alexjr.cursodjava.clientes.dominio.exceptions.CpfInvalidoException;

import java.util.Optional;
import java.util.UUID;

public interface Cadastro<T> {
    void salvar(T objetoCadastrar) throws Exception;

    Optional<T> buscar(UUID codigo);

    void deletar(UUID codigo);

    void atualizar(T objetoAtualizar);

    void imprimirRegistros();
}
