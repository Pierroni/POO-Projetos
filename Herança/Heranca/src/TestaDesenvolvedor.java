public class TestaDesenvolvedor {
    public static void exibirDados(Desenvolvedor camaleao) {
        camaleao.codar();
        System.out.println(camaleao.toString() + "Bônus" + camaleao.calculaBonus());
    }

    public static void main(String[] args) {
        Junior jr = new Junior("Beltrano", "Fulano", "Java", 4000);
        exibirDados(jr);

        Pleno pl = new Pleno("Beltrano", "Java", 6000, 8);
        exibirDados(pl);

        Senior sr = new Senior("Ciclano", "Java", 9000, 30000);
        exibirDados(sr);
    }
}
