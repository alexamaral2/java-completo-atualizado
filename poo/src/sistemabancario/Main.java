package sistemabancario;

public class Main {

    public static void main(String[] args) {

        System.out.println(ValidadorCPF.validarCPF("123"));

        Cliente fulano = new Cliente("01234567890", "fulano");
        System.out.println(fulano.getNome() + " CPF: " + fulano.getCpf());

        Conta contaFulano = new Conta(fulano, 1000, 50);

        Banco sistemaBancario = new Banco();

        System.out.println("Saldo antes do Deposito");
        contaFulano.imprimirSaldo();

        System.out.println("Depositando 100 reais ");
        sistemaBancario.depositar(contaFulano, 100d);

        System.out.println("Saldo depois do depósito");
        contaFulano.imprimirSaldo();

        System.out.println("Sacando o valor de 30 reais");
        sistemaBancario.sacar(contaFulano, 30d);

        contaFulano.imprimirSaldo();

        Cliente cicrano = new Cliente();
        cicrano.setNome("Cicrano");
        cicrano.setCpf("9876543210");

        Conta contaCicrano = new Conta(cicrano, 2000, 0);
        contaCicrano.setTitular(cicrano);
        contaCicrano.setNumero(2000);
        contaCicrano.setSaldo(-50);

        System.out.println("Transferindo 120 reais para o Cicrano.");
        sistemaBancario.transferir(contaFulano, contaCicrano, 120d);

        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();

        System.out.println("Quantidade Clientes: " + Cliente.quantidadeCliente);
    }
}
