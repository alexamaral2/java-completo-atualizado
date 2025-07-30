package estudo.files;

import java.io.*;

public class CriadorArquivo {
    public static void main(String[] args) {
        CriadorArquivo criarArquivo = new CriadorArquivo();
        criarArquivo.lerArquivo();
    }
    public void lerArquivo(){
        try {
            File arquivo = new File("D:\\Users\\Alex Junior\\Documents\\Java\\java-completo-atualizado\\cadastro-clientes\\src\\estudo\\arquivos\\arquivos.txt");

            FileReader fileReader = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(fileReader);

            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();
        } catch (IOException e) {

        }
    }

    public void deletarArquivo() {
        File arquivo = new File("D:\\Users\\Alex Junior\\Documents\\Java\\java-completo-atualizado\\cadastro-clientes\\src\\estudo\\arquivos\\arquivos.txt");
        boolean deletou =  arquivo.delete();
        if (deletou == true) {
            System.out.println("Arquivo deletado com sucesso" + deletou);
        }
    }

    public void lerInformacoesArquivo() {
        File arquivo = new File("D:\\Users\\Alex Junior\\Documents\\Java\\java-completo-atualizado\\cadastro-clientes\\src\\estudo\\arquivos\\arquivos.txt");
        System.out.println("Caminho do arquivo: " + arquivo.getAbsolutePath());
        System.out.println("Nome do arquivo: " + arquivo.getName());
        System.out.println("Tamanho do arquivo: " + arquivo.length());
        System.out.println("É arquivo? " + arquivo.isFile());
    }

    public void criarPasta(){
        File file = new File("D:\\Users\\Alex Junior\\Documents\\Java\\java-completo-atualizado\\cadastro-clientes\\src\\estudo\\arquivos\\pasta");
        boolean criou = file.mkdir();
        System.out.println("Criou? " + criou);
    }

    public void criarArquivo() {
        try {
            File arquivo = new File("D:\\Users\\Alex Junior\\Documents\\Java\\java-completo-atualizado\\cadastro-clientes\\src\\estudo\\arquivos\\arquivos.txt");

            FileWriter fileWriter = new FileWriter(arquivo);

            BufferedWriter writter = new BufferedWriter(fileWriter);

            writter.write("Conteúdo do novo arquivo");

            writter.flush();
            writter.close();
        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo: "  + e.getMessage());
        }
    }
}
