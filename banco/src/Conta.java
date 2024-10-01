public abstract class Conta implements IConta {
    private static int SEQUENCIA = 1;

    private int numeroConta;
    private String nomeAgencia;
    private Cliente titular;
    private double saldo;

    public Conta(String nomeAgencia, Cliente titular) {
        this.numeroConta = SEQUENCIA++;
        this.nomeAgencia = nomeAgencia;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do depósito deve ser maior que 0!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("O valor do saque é maior que o saldo disponível!");
            }
        } else {
            System.out.println("O valor do saque deve ser maior que 0!");
        }
    }

    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.getTitular().getNome()));
        System.out.println(String.format("Conta: %d", this.getNumeroConta()));
        System.out.println(String.format("Agência: %s", this.getNomeAgencia()));
        System.out.println(String.format("Saldo: %s", this.getSaldo()));
    }
}
