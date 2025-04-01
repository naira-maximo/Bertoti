public class Banco {
    private double saldoTotal = 0;

    public void calcularSaldo() {

        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(2000);

        saldoTotal = cc.getSaldo() + cp.getSaldo();
        System.out.println("Saldo total do banco: " + saldoTotal);
    }
}
