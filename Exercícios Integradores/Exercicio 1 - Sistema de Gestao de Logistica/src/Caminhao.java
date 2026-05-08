public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao() {
        super();
    }

    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custoDistancia = distancia * 5;
        double custoEixos = this.getQuantidadeEixos() * 50;

        return custoDistancia + custoEixos;
    }

    @Override
    public String toString() {
        return "\n| Caminhão |" +
                super.toString() +
                "\nQuantidade de eixos: " + this.getQuantidadeEixos();
    }
}
