public class Leaf implements Component {
    private String nome;

    public Leaf(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir() {
        System.out.println("Leaf: " + nome);
    }
}
