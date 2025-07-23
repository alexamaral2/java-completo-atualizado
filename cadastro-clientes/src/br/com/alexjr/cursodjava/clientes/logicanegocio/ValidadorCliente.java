package br.com.alexjr.cursodjava.clientes.logicanegocio;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.exceptions.CpfInvalidoException;
import br.com.alexjr.cursodjava.clientes.dominio.exceptions.DadoObrigatorioException;

public class ValidadorCliente {

    public static void validar(Cliente cliente) throws CpfInvalidoException {
        if(cliente.getCpf().length() != 11){
            throw new CpfInvalidoException("Cpf inválido!");
        }

        validarDadosObrigatorios(cliente);
    }

    private static void validarDadosObrigatorios(Cliente cliente) {
        if (cliente.getNome() == null) {
            throw new DadoObrigatorioException("Campo nome é obrigatorio");
        }
    }
}
