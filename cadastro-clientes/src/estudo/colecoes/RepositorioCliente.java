package estudo.colecoes;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;

public class RepositorioCliente {

    private Cliente[] arrayClientes;
    private int posicaoAtual;

    public RepositorioCliente() {
        this.arrayClientes = new Cliente[1000];
        posicaoAtual = 0;
    }

    public void adicionar(Cliente cliente) {
        this.arrayClientes[posicaoAtual] = cliente;
        posicaoAtual++;
    }

    public void imprimirClientes() {
        for (Cliente cliente : this.arrayClientes) {
            System.out.println(cliente);
        }
    }
}
