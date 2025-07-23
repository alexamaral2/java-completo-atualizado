package estudo.exceptions;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.enums.TipoSexo;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente();
            //cliente.setSexo(TipoSexo.F);
            String descricao = cliente.getSexo().getDescricao();
            System.out.println(descricao);
        } catch (NullPointerException e) {
            System.out.println("O tipo sexo estava null!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado!");
        }
    }
}
