import java.util.ArrayList;

public class EmpresaLogistica {
    private String nomeEmpresa;
    private ArrayList<Veiculo> frota = new ArrayList<>();

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void gerarRelatorioCustos(double distancia) {
        System.out.printf("\n=====| RELATÓRIO DE CUSTOS DA VIAGEM (%.2fKM) |=====", distancia);
        for (Veiculo veiculo : frota) {
            double custo = veiculo.calcularCustoViagem(distancia);
            System.out.println(veiculo);
            System.out.printf("Custo da viagem: R$%.2f%n", custo);
        }
    }
}
