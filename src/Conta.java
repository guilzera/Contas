public class Conta {
    private int conta;
    protected double saldo;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int conta) {
        this.conta = conta;
        this.saldo = 100;
    }

    public void movimentacao(double valor) {
        if(valor >= -1000 && valor <= 1000) {
            saldo += valor;
        }
        else {
            System.out.println("ATENÇÂO: Não é possível movimentar mais de R$ 1000,00");
        }
    }

    public void saldo() {
        System.out.println("=======");
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: R$ " + saldo);
    }
}
