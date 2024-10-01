import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", "123.456.789-10", LocalDate.of(1998, 11, 10), "Cidade da Luz, MT");
        Cliente c2 = new Cliente("Maria", "987-654-321-01", LocalDate.of(1988, 4, 29), "Cidade Bonita, PR");

        IConta contaPoupanca = new ContaPoupanca("BR", c1);
        IConta contaCorrente = new ContaCorrente("SP", c2);

        contaPoupanca.depositar(100);
        contaPoupanca.transferir(70, contaCorrente);

        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
    }
}