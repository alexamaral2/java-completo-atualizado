package br.com.alexjr.cursodjava.clientes.dominio.exceptions;

public class DadoObrigatorioException extends RuntimeException {

    public DadoObrigatorioException(String message) {
        super(message);
    }
}
