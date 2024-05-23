import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtosEmEstoque; // Lista de produtos em estoque

    public Estoque() {
        produtosEmEstoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (Produto p : produtosEmEstoque) {
            if (p.getCodigo() == produto.getCodigo()) {
                p.setQuantidadeEstoque(p.getQuantidadeEstoque() + quantidade);
                return;
            }
        }
        produtosEmEstoque.add(produto);
    }

    public int verificarEstoque(Produto produto) {
        for (Produto p : produtosEmEstoque) {
            if (p.getCodigo() == produto.getCodigo()) {
                return p.getQuantidadeEstoque();
            }
        }
        return 0;
    }
}
