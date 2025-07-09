public class Carro {
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitros;

    void abastecer(int litros) {
        int verificaCapacidade = combustivel + litros;

        if (verificaCapacidade <= capacidadeTanque) {
            combustivel += litros;
            System.out.println("Abastecido com " + litros + " litros.");
        } else {
            int litrosPossiveis = capacidadeTanque - combustivel;
            combustivel = capacidadeTanque;
            System.out.println("Tanque cheio. Só foi possível abastecer com " + litrosPossiveis + " litros.");
        }
    }

    int autonomiaCombustivel(){
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }
}
