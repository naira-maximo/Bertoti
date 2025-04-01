import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String nome;
    private List<Component> filhos; // Agregação de componentes

    public Composite(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    // Método para adicionar um componente ao composite
    public void add(Component componente) {
        filhos.add(componente);
    }

    @Override
    public void imprimir() {
        System.out.println("Composite: " + nome);
        for (Component filho : filhos) {
            filho.imprimir(); // Polimorfismo: Cada filho pode ser um Leaf ou Composite
        }
    }
    public static void main(String[] args) {
        // Criando folhas (Leaf)
        Component leaf1 = new Leaf("Folha 1");
        Component leaf2 = new Leaf("Folha 2");
        Component leaf3 = new Leaf("Folha 3");

        // Criando composite (que pode conter outras folhas ou composites)
        Composite composite1 = new Composite("Composite 1");
        Composite composite2 = new Composite("Composite 2");

        // Adicionando folhas e compostos ao composite
        composite1.add(leaf1);  // Adiciona Folha 1 ao Composite 1
        composite1.add(leaf2);  // Adiciona Folha 2 ao Composite 1
        composite2.add(leaf3);  // Adiciona Folha 3 ao Composite 2

        // Criando uma raiz (Composite maior que contém outros composites)
        Composite raiz = new Composite("Raiz");
        raiz.add(composite1); // Adiciona Composite 1 à Raiz
        raiz.add(composite2); // Adiciona Composite 2 à Raiz

        // Exibindo a estrutura da árvore
        raiz.imprimir(); // Chama o método imprimir que percorre a árvore
    }
}

