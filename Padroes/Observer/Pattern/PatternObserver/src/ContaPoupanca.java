public class ContaPoupanca implements Conta {
    private double saldo;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calcularSaldo() {
        return saldo;
    }

    public int getSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSaldo'");
    }
}
