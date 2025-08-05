package estudo.funcional;

public class Main {
    public static void main(String[] args) {

        // implementação via classe anonima
        Calculadora soma = new Calculadora() {
            @Override
            public int calcular(int x, int y) {
                return x + y;
            }
        };

        // expressão lambda
        soma = (x, y) -> x + y;

        System.out.println(soma.calcular(1, 1));

        Calculadora subtracao = (num1, num2) -> num1 - num2;

        System.out.println(subtracao.calcular(20, 10));

        Calculadora calc = (y, x) -> {
            var valor = y * 2;
            return valor + x;
        };

        Executor executor = param -> subtracao.calcular(50, 30);
        executor.executar(50);
    }
}
