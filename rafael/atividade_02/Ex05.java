import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex05 {
    /*
     * 5. Crie uma classe ContaBancaria com atributos saldo e titular. Adicione
     * métodos para
     * depositar e sacar dinheiro, e um método para verificar o saldo.
     */
    public static class ContaBancaria {
        private String titular;
        private double saldo;
        private static final DecimalFormat df = new DecimalFormat("0.00");

        public ContaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;

            System.out.println("--- " + this.titular + " ----");

        }

        public void depositar(double quantia) {
            if (quantia > 0) {
                this.saldo += quantia;
                System.out.println("Depósito de R$" + df.format(quantia) + " realizado com sucesso. Novo saldo: R$"
                        + df.format(this.saldo));
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public void sacar(double quantia) {
            if (quantia > 0 && quantia <= this.saldo) {
                this.saldo -= quantia;
                System.out.println("Saque de R$" + df.format(quantia) + " realizado com sucesso. Novo saldo: R$"
                        + df.format(this.saldo));
            } else {
                System.out.println("Saldo insuficiente ou valor de saque inválido.");
            }
        }

        public double verificarSaldo() {
            return this.saldo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[>] Insira o nome do titular:");
        String nome = sc.nextLine();

        System.out.println("De início, você vai receber R$ 800,00...");

        ContaBancaria conta = new ContaBancaria(nome, 800.0);
        System.out.println("Saldo inicial: R$" + ContaBancaria.df.format(conta.verificarSaldo()));

        System.out.println("[-] Insira a quantia para depositar:");
        double deposito = sc.nextDouble();

        conta.depositar(deposito);

        System.out.println("[-] Insira a quantia para sacar:");
        double saque = sc.nextDouble();

        conta.sacar(saque);

        System.out.println("Saldo final: R$" + ContaBancaria.df.format(conta.verificarSaldo()));
        sc.close();
    }
}
