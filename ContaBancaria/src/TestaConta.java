public class TestaConta{
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nomeCliente = "João Silva";
        c1.agencia = 4065;
        c1.numeroConta = 5236456;
        System.out.println(c1.toString());
        c1.depositar(500.0F);
        System.out.println(c1.toString());
        c1.sacar(200.0F);
        System.out.println(c1.toString());
        c1.sacar(300.0F);
        System.out.println(c1.toString());
        c1.encerrarConta();
        System.out.println(c1.toString());
        Conta c2 = new Conta();
        c2.nomeCliente = "Maria Souza";
        c2.agencia = 3068;
        c2.numeroConta = 3645289;
        System.out.println(c2.toString());
        c2.sacar(50.0F);
    }
}