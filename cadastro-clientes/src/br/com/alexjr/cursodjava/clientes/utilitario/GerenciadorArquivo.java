package br.com.alexjr.cursodjava.clientes.utilitario;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerenciadorArquivo {

    public static final String pastaFotos = "D:\\Users\\Alex Junior\\Documents\\Java\\java-completo-atualizado\\cadastro-clientes\\src\\estudo\\arquivos\\";

    public static void persistirArquivo(String nome, byte[] bytes) {
        try {
            Path path = Paths.get(pastaFotos + nome);
            Files.write(path, bytes);
        } catch(IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
