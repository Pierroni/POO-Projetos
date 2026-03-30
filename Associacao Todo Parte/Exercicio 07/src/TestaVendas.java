public class TestaVendas {
    public static void main(String[] args) {
        Produto p1 = new Produto("101", "Detergente", 8.5f);
        Produto p2 = new Produto("74", "Bucha de lavar louça - 4un.", 7f);
        System.out.println(p1);

        Cliente c1 = new Cliente("123", "João");
        System.out.println(c1);

        Venda v1 = new Venda(c1);

        v1.adicionarItem("1", 3, p1);
        v1.adicionarItem("2", 1, p2);

        System.out.println(v1);
    }
}