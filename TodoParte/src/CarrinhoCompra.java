import java.util.ArrayList;
import java.util.Date;

public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList<ItemCarrinho> itemCarrinhos;

    public CarrinhoCompra() {
    }

    public CarrinhoCompra(ArrayList<ItemCarrinho> itemCarrinhos) {
        this.itemCarrinhos = itemCarrinhos;
    }

    // Esse construtor caracteriza uma agregação
    // Motivo: cliente já veio criado, é independente
    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itemCarrinhos = new ArrayList<>();
    }

    public void adicionaItemCarrinho(int id, float qntd, Produto produto){
        ItemCarrinho aux = new ItemCarrinho(id, qntd, produto);
        this.itemCarrinhos.add(aux);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void calculaTotalCompra(){
        float valorTotal = 0;
        for(ItemCarrinho aux : this.itemCarrinhos){
            valorTotal += aux.getQntd() * aux.getProduto().getPreco();
        }
        System.out.println("Valor total da compra R$ " + valorTotal);
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "id=" + id +
                ", data=" + data +
                ", \ncliente=" + cliente +
                '}';
    }
}