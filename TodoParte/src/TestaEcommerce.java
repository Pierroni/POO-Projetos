import java.util.Date;

public class TestaEcommerce {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("123", "Pedro", "Logo Ali");
        CarrinhoCompra cc1 = new CarrinhoCompra(1, new Date(), client1);
        System.out.println(cc1.toString());

        Produto produto1 = new Produto(11, "coller", "fun", 100);
        Produto produto2 = new Produto(10, "memoria", "16 GB", 900);

        System.out.println(cc1.toString());
    }
}