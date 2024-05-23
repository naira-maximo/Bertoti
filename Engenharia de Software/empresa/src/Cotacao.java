import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cotacao {

    // Atributos
    private int numero;
    private String cliente;
    private LocalDate dataCotacao;
    private List<ItemCotado> itensCotados; // Lista de itens cotados

    // Métodos de acesso
    public List<ItemCotado> getItensCotados() {return itensCotados;}
    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}
    public String getCliente() {return cliente;}
    public void setCliente(String cliente) {this.cliente = cliente;}
    public LocalDate getDataCotacao() {return dataCotacao;}
    public void setDataCotacao(LocalDate dataCotacao) {this.dataCotacao = dataCotacao;}

    // Construtor
    public Cotacao(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.dataCotacao = LocalDate.now();
        this.itensCotados = new ArrayList<>();
    }

    // Método para cotação
    public void adicionarItem(Produto produto, int quantidade) {
        itensCotados.add(new ItemCotado(produto, quantidade));
    }
}
