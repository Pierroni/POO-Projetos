public class ItemVenda {
    private String id;
    private int qntd;
    private Produto produto; // Atributo de agregação

    public ItemVenda() {
    }

    public ItemVenda(String id, int qntd, Produto produto) {
        this.id = id;
        this.qntd = qntd;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItem ID: " + getId() +
                "\n | Produto: " + produto.getNome() +
                "\n | Preço Un.: R$" + produto.getPreco() +
                "\n | Qntd: " + getQntd() +
                "\n | Subtotal: R$" + (getQntd() * produto.getPreco());
    }
}