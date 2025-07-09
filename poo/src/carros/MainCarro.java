package carros;

public class MainCarro {
    public static void main(String[] args) {

        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "Preta";
        punto.montadora = "Fiat";
        punto.transmissao = "Manual";
        punto.capacidadeTanque = 50;
        punto.combustivel = 0;
        punto.kmPorLitros = 10;

        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Automatica";
        civic.capacidadeTanque = 48;
        civic.combustivel = 10;
        civic.kmPorLitros = 8;

        System.out.println("Dados do Punto:");
        System.out.println("Montadora: " + punto.montadora);
        System.out.println("Cor: " + punto.cor);
        System.out.println("Transmissão: " + punto.transmissao);
        System.out.println("Cavalos: " + punto.cavalos);
        System.out.println("Combustivel: " + punto.combustivel);

        System.out.println("\nDados do Civic:");
        System.out.println("Montadora: " + civic.montadora);
        System.out.println("Cor: " + civic.cor);
        System.out.println("Transmissão: " + civic.transmissao);
        System.out.println("Cavalos: " + civic.cavalos);
        System.out.println("Combustivel: " + civic.combustivel);

        punto.abastecer(20);
        civic.abastecer(30);

        System.out.println("\nDados do Punto:");
        System.out.println("depois do abastecimento: " + punto.combustivel);

        System.out.println("\nDados do Civic:");
        System.out.println("depois do abastecimento: " + civic.combustivel);

        System.out.println("\nAutonomia Punto: " + punto.autonomiaCombustivel());
        System.out.println("Autonomia Civic: " + civic.autonomiaCombustivel());
    }
}
