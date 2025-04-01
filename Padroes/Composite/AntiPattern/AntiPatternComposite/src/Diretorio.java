import java.util.ArrayList;
import java.util.List;

// Classe Composto (Diretório)
class Diretorio {
    private String nome;
    private List<Object> elementos = new ArrayList<>(); // Lista de elementos que podem ser arquivos ou diretórios

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionar(Object elemento) {
        elementos.add(elemento);
    }

    public void exibir() {
        System.out.println("Diretório: " + nome);
        for (Object elemento : elementos) {
            if (elemento instanceof Arquivo) {
                System.out.println("    Arquivo: " + ((Arquivo) elemento).getNome());
            } else if (elemento instanceof Diretorio) {
                ((Diretorio) elemento).exibir();
            }
        }
    }
}