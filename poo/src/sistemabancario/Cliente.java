package sistemabancario;

public class Cliente {

    public static int quantidadeCliente;

    private String cpf;
    private String nome;

    Cliente(){
        incrementarCliente();
    }

    Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        incrementarCliente();
    }

    //Padrão GET e SET
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void incrementarCliente(){
        Cliente.quantidadeCliente++;
    }
}
