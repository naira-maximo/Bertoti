// Classe principal para testar o padrão Singleton
public class Main {
    public static void main(String[] args) {
        // Tentando obter a única instância da configuração
        Singleton config1 = Singleton.getInstancia();
        config1.carregarConfiguracao();

        // Tentando obter a instância novamente (será a mesma)
        Singleton config2 = Singleton.getInstancia();

        // Verificando se as instâncias são iguais
        if (config1 == config2) {
            System.out.println("Ambas as referências apontam para a mesma instância de ConfiguracaoSingleton.");
        } else {
            System.out.println("As instâncias são diferentes (não deveria acontecer no Singleton).");
        }
    }
}
