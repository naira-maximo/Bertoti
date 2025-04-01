// Classe Singleton
public class Singleton {

    // Instância privada estática que armazenará a única instância do Singleton
    private static Singleton instanciaUnica;

    // Construtor privado para impedir a criação de novas instâncias externamente
    private Singleton() {
        // Pode inicializar dados aqui, se necessário
        System.out.println("Configuração inicializada.");
    }

    // Método público estático para retornar a única instância
    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Exemplo de método na classe Singleton
    public void carregarConfiguracao() {
        System.out.println("Carregando as configurações...");
    }
}