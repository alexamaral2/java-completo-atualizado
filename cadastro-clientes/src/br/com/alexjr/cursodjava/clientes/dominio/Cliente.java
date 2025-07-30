package br.com.alexjr.cursodjava.clientes.dominio;

import br.com.alexjr.cursodjava.clientes.dominio.enums.TipoSexo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Cliente implements Comparable<Cliente> {

    private UUID codigo;
    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private int idade;
    private byte[] foto;
    private Boolean ativo;

    public Cliente() {
        this.codigo = UUID.randomUUID();
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", foto=" + Arrays.toString(foto) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(codigo, cliente.codigo) && Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) && sexo == cliente.sexo && Objects.deepEquals(foto, cliente.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, cpf, sexo, Arrays.hashCode(foto));
    }

    @Override
    public int compareTo(Cliente o) {
        int fator = this.nome.compareTo(o.getNome());
        if (fator == 0) {
            fator = this.sexo.equals(o.getSexo()) ? -1 : 1;
        }

        return fator;
    }
}
