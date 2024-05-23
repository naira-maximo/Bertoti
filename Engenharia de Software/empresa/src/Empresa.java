import java.util.List;

public class Empresa {
    // Atributos
    private Estoque  estoque;
    private int proximoNumeroCotacao;

    // Construtor
    public Empresa() {
        this.estoque = new Estoque();
        this.proximoNumeroCotacao = 1;
    }

    // Métodos2
    public void cadastrarProduto(Produto produto) {
        estoque.adicionarProduto(produto, produto.getQuantidadeEstoque());
    }

    public int verificarEstoque(Produto produto) {
        return estoque.verificarEstoque(produto);
    }

    public Cotacao fazerCotacao(String cliente, List<ItemCotado> itens) {
        Cotacao cotacao = new Cotacao(proximoNumeroCotacao++, cliente);
        for (ItemCotado item : itens) {
            cotacao.adicionarItem(item.getProduto(), item.getQuantidade());
        }
        return cotacao;
    }
}