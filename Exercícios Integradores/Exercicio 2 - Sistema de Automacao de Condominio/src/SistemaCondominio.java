public class SistemaCondominio {
    public static void main(String[] args) {
        Camera cam1 = new Camera("Entrada principal", true, "4K");
        Camera cam2 = new Camera("Canteiro dianteiro", false, "4K");
        SensorMovimento s1 = new SensorMovimento("Entrada principal", true, 5);
        SensorMovimento s2 = new SensorMovimento("Canteiro dianteiro", true, 8);
        Condominio cond1 = new Condominio();

        cond1.setNome("Residencial Jardim dos Pardais");
        cond1.adicionarDispositivo(cam1);
        cond1.adicionarDispositivo(cam2);
        cond1.adicionarDispositivo(s1);
        cond1.adicionarDispositivo(s2);

        cond1.testeGeralSeguranca();
        cond1.exibirInformacoes();
    }
}
