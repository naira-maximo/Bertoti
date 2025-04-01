// Projeto 2: Strategy Pattern - Animais

interface Locomocao {
    void mover();
}

// Implementações de locomoção
class Voo implements Locomocao {
    public void mover() {
        System.out.println("Voando");
    }
}

class Corrida implements Locomocao {
    public void mover() {
        System.out.println("Correndo");
    }
}

// Classe Animal com Locomocao
class AnimalStrategy {
    private Locomocao locomocao;

    public void setLocomocao(Locomocao locomocao) {
        this.locomocao = locomocao;
    }

    public void locomover() {
        if (locomocao != null) {
            locomocao.mover();
        } else {
            System.out.println("Animal parado.");
        }
    }

    public void comer() {
        System.out.println("Animal está comendo.");
    }
}

// Teste no método main
public class StrategyPattern {
    public static void main(String[] args) {
        AnimalStrategy gato = new AnimalStrategy();
        gato.setLocomocao(new Corrida());
        gato.locomover();

        AnimalStrategy passaro = new AnimalStrategy();
        passaro.setLocomocao(new Voo());
        passaro.locomover();
    }
}
