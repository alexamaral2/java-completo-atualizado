package br.com.alexjr.cursodjava.clientes.logicanegocio;

import java.util.UUID;

public interface Cadastro<T> {
    void salvar(T objetoCadastrar);

    T buscar(UUID codigo);

    void deletar(UUID codigo);

    void atualizar(T objetoAtualizar);

    void imprimirRegistros();
}
