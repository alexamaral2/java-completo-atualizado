package br.com.alexjr.cursodjava.clientes.dominio.enums;

public enum TipoSexo {
    M("Masculino"),
    F("Feminino");

    private final String descricao;
    TipoSexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
