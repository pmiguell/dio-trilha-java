public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João");
        Cliente c2 = new Cliente("Maria");

        IConta contaCorrente = new ContaCorrente(c1);
        IConta contaPoupanca = new ContaPoupanca(c2);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}