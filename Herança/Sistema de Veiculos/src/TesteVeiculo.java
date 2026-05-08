public class TesteVeiculo {
    public static void interacaoVeiculo(Veiculo referencia){
        System.out.println(referencia.toString()); // Polimorfismo
        referencia.mover();                        // Polimorfismo
        referencia.abastecer();                    // Polimorfismo
    }

    public static void main(String[] args) {
        Aviao av1 = new Aviao("Embraer", "E190", 700, 12500);
        CarroEletrico c1 = new CarroEletrico("BYD", "King", 80, 450);

        interacaoVeiculo(av1);
        interacaoVeiculo(c1);
    }
}
