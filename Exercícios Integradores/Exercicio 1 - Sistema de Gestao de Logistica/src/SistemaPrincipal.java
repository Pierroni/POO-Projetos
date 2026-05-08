public class SistemaPrincipal {
    public static void main(String[] args) {
        EmpresaLogistica emp1 = new EmpresaLogistica();
        emp1.setNomeEmpresa("Jaguará Transportes");

        Caminhao truck1 = new Caminhao("ABC1234", 12000, 3);
        Caminhao truck2 = new Caminhao("CBA4321", 25000, 4);
        Van v1 = new Van("XYZ6789", 1200, false);
        Van v2 = new Van("ZYX9876", 950, true);

        truck1.exibirDados();
        truck2.exibirDados();
        v1.exibirDados();
        v2.exibirDados();

        emp1.adicionarVeiculo(truck1);
        emp1.adicionarVeiculo(truck2);
        emp1.adicionarVeiculo(v1);
        emp1.adicionarVeiculo(v2);

        emp1.gerarRelatorioCustos(300);
    }
}
