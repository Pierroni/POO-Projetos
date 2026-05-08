public class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao() {
        super();
    }

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

    @Override
    public void mover() {
        System.out.printf("\nAvião voando a %s km/h e %s metros...\n", this.velocidade, this.altitudeMax);
    }

    @Override
    public void abastecer() {
        System.out.println("\nAbastecendo com querosene de aviação...\n");
    }

    @Override
    public String toString() {
        return "| Avião |" +
                super.toString() +
                "\nAltitude máxima: " + getAltitudeMax() + "m";
    }
}
