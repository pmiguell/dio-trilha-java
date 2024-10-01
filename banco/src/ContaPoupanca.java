public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeAgencia, Cliente titular) {
        super(nomeAgencia, titular);
    }

    public void imprimirExtrato() {
        System.out.println("======== Extrato Conta Poupança ========");
        super.imprimirInfosComuns();
    }
}
