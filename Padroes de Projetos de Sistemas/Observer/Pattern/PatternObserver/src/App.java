public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Adicionando diferentes contas
        banco.adicionarConta(new ContaCorrente(1000));
        banco.adicionarConta(new ContaPoupanca(2000));

        // Calculando saldo total
        banco.calcularSaldo();
    }
}
