public class ContaCorrente extends Banco{
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
