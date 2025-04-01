import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private double saldoTotal = 0;

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void calcularSaldo() {
        saldoTotal = 0;
        for (Conta conta : contas) {
            saldoTotal += conta.calcularSaldo();
        }
        System.out.println("Saldo total do banco: " + saldoTotal);
    }
}
