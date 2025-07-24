package estudo.exceptions;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.enums.TipoSexo;
import br.com.alexjr.cursodjava.clientes.dominio.exceptions.CpfInvalidoException;
import br.com.alexjr.cursodjava.clientes.logicanegocio.ValidadorCliente;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //try {
        //     Cliente cliente = new Cliente();
        //    cliente.setSexo(TipoSexo.F);
        //    String descricao = cliente.getSexo().getDescricao();
        //    System.out.println(descricao);
        // } catch (NullPointerException e) {
        //    System.out.println("O tipo sexo estava null!");
        //} catch (Exception e) {
        //    System.out.println("Ocorreu um erro inesperado!");
        //}

        //Cliente cliente = new Cliente();
        //cliente.setCpf("0123456");

        // try {
        //    ValidadorCliente.validar(cliente);
        //    System.out.println("CPF OK");
        //} catch (CpfInvalidoException e) {
        //    System.out.println(e.getMessage());
        //} catch (RuntimeException e) {
        //    System.out.println(e.getMessage());
        //} catch (Exception e) {
        //    System.out.println("Erro inesperado!");
        //} finally {
        //    System.out.println("Fui executado no finally");
        //}

        Scanner scanner = new Scanner(System.in);
        try {
            Cliente c = new Cliente();
            String cpf = scanner.nextLine();
            c.setCpf(cpf);
            ValidadorCliente.validar(c);
        } catch (CpfInvalidoException e) {
            System.out.println("CPF invalido!");
        } finally {
            System.out.println("Fechando o Scanner");
            scanner.close();
            System.out.println("Scanner fechado");
        }
    }
}
