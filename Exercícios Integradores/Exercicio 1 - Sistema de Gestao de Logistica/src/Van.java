public class Van extends Veiculo {
    private boolean refrigerada;

    public Van() {
        super();
    }

    public Van(String placa, double capacidadeCarga, boolean refrigerada) {
        super(placa, capacidadeCarga);
        this.refrigerada = refrigerada;
    }

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double taxaRefrigeracao = 0;
        double custoDistancia = distancia * 3;

        if (this.isRefrigerada()) {
            taxaRefrigeracao = 100;
        }

        return custoDistancia + taxaRefrigeracao;
    }

    @Override
    public String toString() {
        return "\n| Caminhão |" +
                super.toString() +
                "\nPossui sistema de refrigeração? " + (this.isRefrigerada() ? "Sim" : "Não");
    }
}
