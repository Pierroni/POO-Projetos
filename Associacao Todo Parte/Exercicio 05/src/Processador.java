public class Processador {
    private String marca, modelo, frequencia;

    public Processador() {
    }

    public Processador(String marca, String modelo, String frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\nProcessador" +
                "\nMarca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nFrequência: " + getFrequencia() + "\n";
    }
}