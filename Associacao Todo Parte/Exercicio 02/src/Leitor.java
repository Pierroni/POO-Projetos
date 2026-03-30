public class Leitor {
    private String id, nome;

    public Leitor() {
    }

    public Leitor(String id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nid: " + getId() +
                "\nNome: " + getNome();
    }
}