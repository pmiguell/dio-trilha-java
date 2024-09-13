import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        while(quantidade > 0) {
            Item item = new Item(nome, preco, 1);
            carrinho.add(item);
            quantidade--;
        }
    }

    public void removerItem(String nome) {
        for(int i = 0; i<carrinho.size(); i++) {
            if(carrinho.get(i).getNome().equals(nome)) {
                carrinho.remove(i);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;

        for(int i = 0; i<carrinho.size(); i++) {
            total += carrinho.get(i).getPreco() * carrinho.get(i).getQuantidade();
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }
}
