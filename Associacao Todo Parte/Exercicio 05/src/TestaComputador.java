public class TestaComputador {
    public static void main(String[] args) {
        Processador p1 = new Processador("Ryzen", "5600G", "4200MHz");
        System.out.println(p1);

        Computador pc1 = new Computador("12345", "DELL", "Core", "i3", "4700MHz");
        System.out.println(pc1);

        pc1 = null;

        System.out.println(pc1);
    }
}