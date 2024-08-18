package labiii.suculenta;

import java.util.UUID;

public class Suculenta {
    private final String id;
    private String nome;
    private String familia;

    public Suculenta(String id, String nome, String familia) {
        this.id = id;
        this.nome = nome;
        this.familia = familia;
    }

    public Suculenta(String nome, String familia) {
        this(UUID.randomUUID().toString(), nome, familia);
    }

    public String getId() {
        return id;
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
