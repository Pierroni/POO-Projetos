public class Produto {
    private String id, nome;
    private float preco;

    public Produto() {
    }

    public Produto(String id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
                "\nProduto id: " + getId() +
                "\nPreço unit.: R$" + getPreco();
    }
}