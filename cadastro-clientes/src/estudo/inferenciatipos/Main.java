package estudo.inferenciatipos;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.logicanegocio.LogicaCadastroClienteFake;

public class Main {
    public static void main(String[] args) {
        int numero = 10;
        double flutuante;
        flutuante = 10d;
        var outroNumero = 15;
        var cliente = new Cliente();
        var logica = new LogicaCadastroClienteFake();

        var i = 15;
        i = 20;
    }
}
