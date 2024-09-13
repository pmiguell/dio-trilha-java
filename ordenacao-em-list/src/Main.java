public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Pedro", 22, 1.75);
        ordenacaoPessoa.adicionarPessoa("Antonella", 20, 1.68);
        ordenacaoPessoa.adicionarPessoa("Paulo", 23, 1.55);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}