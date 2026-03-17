public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    // construtor sem parâmetros
    public ArCondicionado() {
        this.marca = "Generico";
        this.modelo = "Standard";
        this.temperatura = 24;
        this.ligado = false;
    }

    // construtor com parâmetros
    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        this.setTemperatura(temperatura);
        this.ligado = false;
    }

    // getters e setters

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

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura inválida! Deve estar entre 16 e 30 graus.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // métodos públicos

    public void ligar() {
        this.ligado = true;
        System.out.println("Ar condicionado ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Ar condicionado desligado.");
    }

    public void ajustarTemperatura(int novaTemp) {
        if (ligado) {
            setTemperatura(novaTemp);
        } else {
            System.out.println("Não é possível ajustar a temperatura. O aparelho está desligado.");
        }
    }

    public void modoTurbo() {
        if (ligado) {
            processarResfriamentoRapido();
        } else {
            System.out.println("Não é possível ativar o modo turbo. O aparelho está desligado.");
        }
    }

    // método privado

    private void processarResfriamentoRapido() {
        System.out.println("Aumentando rotação do compressor...");
        System.out.println("Ligando ventilação máxima...");
        setTemperatura(16);
        System.out.println("Temperatura ajustada para 16°C.");
    }

    // toString

    public String toString() {
        return "Marca: " + marca +
                " | Modelo: " + modelo +
                " | Temperatura: " + temperatura +
                "°C | Status: " + (ligado ? "Ligado" : "Desligado");
    }
}
