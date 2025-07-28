package br.com.alexjr.cursodjava.clientes.strings;

public class Main {

    static String valor = "Maçã";

    public static void main(String[] args) {
        trabalhandoComSubString();
    }

    private static void tamanhoString() {
        int tamanho = valor.length();
        System.out.println("Tamanho: " + tamanho);
    }

    private static void pegarCaracteres() {
        char caractere = valor.charAt(0);
        char ultimo = valor.charAt(valor.length() - 1);

        System.out.println("Primeiro e ultimo Caractere: " + caractere + " e " + ultimo);
    }

    private static void trabalhandoComSubString() {
        String pedaco = valor.substring( 0, 4);
        System.out.println("Substring: " + pedaco);
    }
}
