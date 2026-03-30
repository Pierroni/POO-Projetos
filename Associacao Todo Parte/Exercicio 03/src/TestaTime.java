public class TestaTime {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("123", "João", "Ala-armador");
        Atleta atleta2 = new Atleta("163", "Lúcio", "Pivô");
        Atleta atleta3 = new Atleta("189", "Mauro", "Armador");

        Time time1 = new Time("7890", "Vasco", "Felipinho");
        time1.contratarAtleta(atleta1);
        time1.contratarAtleta(atleta2);
        time1.contratarAtleta(atleta3);

        System.out.println(time1);

        time1 = null;

        System.out.println(atleta1);
    }
}