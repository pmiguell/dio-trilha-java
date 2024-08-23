import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i <= (numero2 - numero1); i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}