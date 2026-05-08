public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico() {
        super();
    }

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover() {
        System.out.println("\nCarro elétrico movendo-se silenciosamente...\n");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida...\n");
    }

    @Override
    public String toString() {
        return "| Carro Elétrico |" +
                super.toString() +
                "\nAutonomia Bateria: " + getAutonomiaBateria() + "%";
    }
}
