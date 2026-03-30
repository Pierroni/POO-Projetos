import java.util.ArrayList;

public class Venda {
    private Cliente cliente; // Agregação - cliente existe fora da classe
    private ArrayList<ItemVenda> itensVenda; // Composição - item criado na classe

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itensVenda = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(String idItem, int qntd, Produto produto) {
        ItemVenda novoItem = new ItemVenda(idItem, qntd, produto);
        this.itensVenda.add(novoItem);
    }

    @Override
    public String toString() {
        String descritivo = "\n============ Sistema de vendas ============";
        descritivo += "\n" + cliente;
        descritivo += "\n\nItens da compra:";

        for (ItemVenda item : itensVenda) {
            descritivo += item;
        }

        return descritivo;
    }
}