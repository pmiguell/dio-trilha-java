public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Notebook", 1000, 2);
        carrinho.adicionarItem("Smartphone", 5000, 1);
        carrinho.adicionarItem("AirPods", 220, 3);

        carrinho.exibirItens();

        carrinho.removerItem("Notebook");
        carrinho.removerItem("AirPods");

        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());
    }
}