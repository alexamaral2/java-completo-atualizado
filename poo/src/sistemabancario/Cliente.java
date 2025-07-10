package sistemabancario;

public class Cliente {

    private String cpf;
    private String nome;

    Cliente(){
    }

    Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
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
}
