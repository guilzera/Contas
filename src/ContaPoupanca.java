public class ContaPoupanca extends Conta {
    public ContaPoupanca(int conta) {
        super(conta);
    }

    public void aplicaJuros() {
         saldo = (double) saldo * 1.005;
    }
}
