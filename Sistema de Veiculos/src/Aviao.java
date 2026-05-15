public class Aviao extends Veiculo{
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public void mover(){
        System.out.println("o avião esta voando a " + this.velocidade + " KM/h e " + this.altitudeMax + " metros");
    }

    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMax=" + altitudeMax +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
