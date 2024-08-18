public class Produto {

    // Atributos
    private int codigo;
    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;

    // Construtor
    public Produto(int codigo, String nome, double precoUnitario, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos de acesso
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getPrecoUnitario() {return precoUnitario;}
    public void setPrecoUnitario(double precoUnitario) {this.precoUnitario = precoUnitario;}
    public int getQuantidadeEstoque() {return quantidadeEstoque;}
    public void setQuantidadeEstoque(int quantidadeEstoque) {this.quantidadeEstoque = quantidadeEstoque;}
}