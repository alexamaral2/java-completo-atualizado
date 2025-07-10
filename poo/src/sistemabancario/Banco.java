package sistemabancario;

public class Banco {

    void depositar(Conta conta, double valor) {
        double saldoAtual = conta.getSaldo();
        double novoSaldo = saldoAtual + valor;
        conta.setSaldo(novoSaldo);
    }

    void sacar(Conta conta, double valor) {
        double saldoAtual = conta.getSaldo();
        double novoSaldo = saldoAtual - valor;
        if (novoSaldo < 0) {
            System.out.println("Não foi possível sacar, o saldo ficará negativo!");
        } else {
            conta.setSaldo(novoSaldo);
        }
    }

    void transferir(Conta origem, Conta destino, double valor) {
        double saldoAtualOrigem = origem.getSaldo();
        double novoSaldoOrigem = saldoAtualOrigem - valor;
        if (novoSaldoOrigem < 0) {
            System.out.println("Transferência não realizada! Saldo insuficiente!");
        } else {
            origem.setSaldo(novoSaldoOrigem);
            double novoSaldoDestino = destino.getSaldo() + valor;
            destino.setSaldo(novoSaldoDestino);
        }
    }
}
