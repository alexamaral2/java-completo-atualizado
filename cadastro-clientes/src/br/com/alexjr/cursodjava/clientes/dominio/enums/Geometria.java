package br.com.alexjr.cursodjava.clientes.dominio.enums;

public class Geometria {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = FormaGeometrica.CIRCULO;
        int ladosRetangulo = formaGeometrica.getLados();
        System.out.println(ladosRetangulo);
    }
}
