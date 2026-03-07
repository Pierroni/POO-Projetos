public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTv(){

    }

    public SmartTv(String marca, String modelo, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
        this.internet = true;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("O volume informado é inválido!\n");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca) {
        // Metodo lenght() metodo de instância
        if (marca.length() <= 30) {
            this.marca = marca;
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        char letrainicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letrainicial);
        if (resp){
            this.modelo = modelo;
        }
        else System.out.println("modelo invalido");
    }

    public String getModelo() {
        return this.modelo;
    }
}