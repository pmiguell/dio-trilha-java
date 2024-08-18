import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite o número da agência:");
        contaTerminal.numero = scanner.nextInt();

        System.out.println("Digite a agência:");
        contaTerminal.agencia = scanner.next();

        System.out.println("Digite seu nome:");
        contaTerminal.nomeCliente = scanner.next();

        System.out.println("Informe o saldo: ");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.println("Olá, " + contaTerminal.nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo + " já está disponível para saque!");
    }
}