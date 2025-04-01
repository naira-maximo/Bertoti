// Projeto 1: Antipattern de Herança - Animais

// Classe base Animal
class Animal {
    public void comer() {
        System.out.println("Animal está comendo.");
    }
}

// Subclasses que repetem código de comportamento
class Morcego extends Animal {
    @Override
    public void comer() {
        System.out.println("Morcego está comendo.");
    }
}

class Cao extends Animal {
    @Override
    public void comer() {
        System.out.println("Cão está comendo.");
    }
}

class Gato extends Animal {
    @Override
    public void comer() {
        System.out.println("Gato está comendo.");
    }
}

class Papagaio extends Animal {
    @Override
    public void comer() {
        System.out.println("Papagaio está comendo.");
    }
}

// Código main para teste
public class AntipatternHeranca {
    public static void main(String[] args) {
        Animal morcego = new Morcego();
        morcego.comer();

        Animal cao = new Cao();
        cao.comer();

        Animal gato = new Gato();
        gato.comer();

        Animal papagaio = new Papagaio();
        papagaio.comer();
    }
}
