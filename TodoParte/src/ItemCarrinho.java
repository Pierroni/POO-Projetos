public class ItemCarrinho {
    private int id;
    private float qntd;
    private Produto produto;

    public ItemCarrinho() {
    }

    // Esse construtor caracteriza uma agregação
    // Motivo: produto já veio criado, é independente
    public ItemCarrinho(int id, float qntd, Produto produto) {
        this.id = id;
        this.qntd = qntd;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQntd() {
        return qntd;
    }

    public void setQntd(float qntd) {
        this.qntd = qntd;
    }

    public Produto getProduto() {
        return produto;
    }

    // É agregação - produto já veio criado, é independente
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItemCarrinho{" +
                "id=" + id +
                ", qntd=" + qntd +
                "\nproduto=" + produto +
                '}';
    }
}
