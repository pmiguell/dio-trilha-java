public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeAgencia, Cliente titular) {
        super(nomeAgencia, titular);
    }

    public void imprimirExtrato() {
        System.out.println("======== Extrato Conta Corrente ========");
        super.imprimirInfosComuns();
    }
}
