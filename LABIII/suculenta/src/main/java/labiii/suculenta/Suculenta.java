package labiii.suculenta;

import java.util.UUID;

public class Suculenta {
    private int id;
    private String nome;
    private String familia;

    public Suculenta(int id, String nome, String familia) {
        this.id = id;
        this.nome = nome;
        this.familia = familia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
}
