// Classe principal para testar o Antipattern
public class MainAntipattern {
    public static void main(String[] args) {
        // Criando arquivos individuais
        Arquivo arquivo1 = new Arquivo("arquivo1.txt");
        Arquivo arquivo2 = new Arquivo("arquivo2.txt");

        // Criando diretórios
        Diretorio raiz = new Diretorio("Raiz");
        Diretorio subdiretorio = new Diretorio("Subdiretório");

        // Montando a estrutura
        raiz.adicionar(arquivo1);
        subdiretorio.adicionar(arquivo2);
        raiz.adicionar(subdiretorio);

        // Exibindo a estrutura
        raiz.exibir();
    }
}
