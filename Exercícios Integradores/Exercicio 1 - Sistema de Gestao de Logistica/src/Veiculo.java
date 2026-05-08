public abstract class Veiculo {
    protected String placa;
    protected double capacidadeCarga;

    public Veiculo() {
    }

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void exibirDados() {
        System.out.printf("\nDADOS DO VEÍCULO:\n| Placa: %s\n| Capacidade de carga: %.2fkg\n", this.getPlaca(), this.getCapacidadeCarga());
    }

    public abstract double calcularCustoViagem(double distancia);

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "\nPlaca: " + getPlaca() +
                "\nCapacidade de carga: " + getCapacidadeCarga() + "kg";
    }
}