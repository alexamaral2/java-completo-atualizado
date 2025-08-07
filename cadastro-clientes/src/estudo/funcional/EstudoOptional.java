package estudo.funcional;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.logicanegocio.LogicaCadastroMemoria;

import java.util.Optional;
import java.util.UUID;

public class EstudoOptional {

    public static void main(String[] args) {

        var cliente = new Cliente();
        cliente.setNome("Alguem");

        Optional<Cliente> possivelCliente = Optional.ofNullable(cliente);

        if (possivelCliente.isPresent()) {

            cliente = possivelCliente.get();
            System.out.println(cliente.getNome());
        }

        var logica = new LogicaCadastroMemoria();
        var clienteEncontrado = logica.buscar(UUID.randomUUID());

        System.out.println(clienteEncontrado.getSexo().getDescricao());
    }
}
