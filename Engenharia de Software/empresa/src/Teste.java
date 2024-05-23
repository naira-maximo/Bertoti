import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

    @Test
        // Testa o método cadastrarProduto da classe Empresa
    void testeCadastrarProduto() {
        Empresa empresa = new Empresa();
        Produto produto = new Produto(1, "Produto Teste", 10.0, 100);
        empresa.cadastrarProduto(produto);
        assertEquals(100, empresa.verificarEstoque(produto));
    }

    @Test
        // testeFazerCotacao: Testa o método fazerCotacao da classe Empresa
    void testeFazerCotacao() {
        Empresa empresa = new Empresa();
        Produto produto = new Produto(1, "Produto Teste", 10.0, 100);
        empresa.cadastrarProduto(produto);

        List<ItemCotado> itens = new ArrayList<>();
        itens.add(new ItemCotado(produto, 10));
        Cotacao cotacao = empresa.fazerCotacao("Cliente Teste", itens);

        assertEquals(1, cotacao.getNumero());
        assertEquals("Cliente Teste", cotacao.getCliente());
        assertEquals(10, cotacao.getItensCotados().get(0).getQuantidade());
    }

    @Test
        // testeAdicionarProdutoNoEstoque: Testa o método adicionarProduto da classe Estoque
    void testeAdicionarProdutoNoEstoque() {
        Estoque estoque = new Estoque();
        Produto produto = new Produto(1, "Produto Teste", 10.0, 100);
        estoque.adicionarProduto(produto, 100);
        assertEquals(100, estoque.verificarEstoque(produto));
    }

    @Test
        // Testa o método verificarEstoque da classe Estoque
    void testeVerificarEstoque() {
        Estoque estoque = new Estoque();
        Produto produto = new Produto(1, "Produto Teste", 10.0, 100);
        estoque.adicionarProduto(produto, 100);
        assertEquals(100, estoque.verificarEstoque(produto));
    }

    @Test
        // Testa a criação de uma instância da classe Cotacao
    void testeCriarCotacao() {
        Cotacao cotacao = new Cotacao(1, "Cliente Teste");
        assertEquals(1, cotacao.getNumero());
        assertEquals("Cliente Teste", cotacao.getCliente());
        assertEquals(0, cotacao.getItensCotados().size());
    }

    @Test
        // Testa a adição de um item cotado na cotação
    void testeAdicionarItemCotado() {
        Cotacao cotacao = new Cotacao(1, "Cliente Teste");
        Produto produto = new Produto(1, "Produto Teste", 10.0, 100);
        ItemCotado itemCotado = new ItemCotado(produto, 10);
        cotacao.adicionarItem(produto, 10);
        assertEquals(1, cotacao.getItensCotados().size());
        assertEquals(10, cotacao.getItensCotados().get(0).getQuantidade());
    }

    @Test
        // Testa a criação de uma instância da classe Produto
    void testeCriarProduto() {
        Produto produto = new Produto(1, "Produto Teste", 10.0, 100);
        assertEquals(1, produto.getCodigo());
        assertEquals("Produto Teste", produto.getNome());
        assertEquals(10.0, produto.getPrecoUnitario());
        assertEquals(100, produto.getQuantidadeEstoque());
    }

    @Test
        // Testa a criação de uma instância da classe ItemCotado
    void testeCriarItemCotado() {
        Produto produto = new Produto(1, "Produto Teste", 10.0, 100);
        ItemCotado itemCotado = new ItemCotado(produto, 10);
        assertEquals(produto, itemCotado.getProduto());
        assertEquals(10, itemCotado.getQuantidade());
    }
}