public class ContaBancaria {
 
    public String titular;
    public String numeroConta;
    public double saldo;
 
    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
 
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
 
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
 
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
 
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6", 1000.0);
        conta.exibirSaldo();
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(2000.0);
        conta.exibirSaldo();// Tentativa de saque com saldo insuficiente
    }
   
}