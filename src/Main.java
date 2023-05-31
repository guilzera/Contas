import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(11111);
        cc1.movimentacao(-75);

        ContaCorrente cc2 = new ContaCorrente(22222);
        cc2.endereco = "Rua Imaculada Conceição, 1155";
        cc2.movimentacao(250);

        ContaPoupanca cp1 = new ContaPoupanca(33333);
        cp1.aplicaJuros();

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cp1);

        for (Conta conta : contas) {
            conta.saldo();
        }

    }
}