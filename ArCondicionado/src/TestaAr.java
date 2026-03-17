public class TestaAr {

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado("LG", "Dual Inverter", 22);

        // tentar temperatura inválida
        ar.ajustarTemperatura(10);

        // temperatura válida
        ar.ajustarTemperatura(25);

        // imprimir dados
        System.out.println(ar.toString());

        // tentar modo turbo desligado
        ar.modoTurbo();

        // ligar aparelho
        ar.ligar();

        // usar modo turbo
        ar.modoTurbo();

        // estado final
        System.out.println(ar.toString());
    }
}