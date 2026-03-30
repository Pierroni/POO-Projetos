public class Atleta {
    private String id, nome, posicao;

    public Atleta() {
    }

    public Atleta(String id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "\nid: " + getId() +
                "\nNome: " + getNome() +
                "\nPosição: " + getPosicao() + "\n";
    }
}