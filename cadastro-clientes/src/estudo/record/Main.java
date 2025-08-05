package estudo.record;

public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Fulano", "0123");
        String nome = pessoa.getNome();

        var pessoaRecord = new PessoaRecord("Nome", "000.111.222-33");
        String nomePessoaRecord = pessoaRecord.nome();

        // JSON -> {"id": 1, "nome" : "Pessoa"}

        System.out.println(pessoaRecord.getCPFSemFormatado());

        pessoaRecord = pessoaRecord.comNome("Fulano");
    }
}
