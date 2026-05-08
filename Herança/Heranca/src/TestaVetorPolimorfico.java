public class TestaVetorPolimorfico {
    public static void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];
        devs[0] = new Junior("Beltrano", "Fulano", "Java", 4000);
        devs[1] = new Pleno("Beltrano", "Java", 6000, 8);
        devs[2] = new Senior("Ciclano", "Java", 9000, 30000);
        devs[3] = new Desenvolvedor("Luizin", "Visualg", 10000);

        for (Desenvolvedor dev : devs) {
            System.out.print("|===================================================================|");
            dev.codar();
            System.out.println("Bônus do dev: R$" + dev.calculaBonus());
            System.out.println("\nDados do dev: " + dev.toString());
        }
    }
}
