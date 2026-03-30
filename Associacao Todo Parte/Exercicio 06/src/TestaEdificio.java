public class TestaEdificio {
    public static void main(String[] args) {
        Edificio edf1 = new Edificio("Garça Branca", "Rua 1, ao lado da rua 2");
        System.out.println(edf1);

        edf1.construirApartamento(108, 17);
        edf1.construirApartamento(101, 16);
        edf1.construirApartamento(85, 14);

        System.out.println(edf1);
    }
}