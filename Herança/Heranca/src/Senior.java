// CLASSE FILHA OU SUBCLASSE
public class Senior extends Desenvolvedor {
    private float verbaLider;

    public Senior() {
        super();
    }

    public Senior(String nome, String linguagem, float salarioBase, float verbaLider) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public void codar() {
        System.out.println("\nSênior definindo a arquitetura e liderando pessoas");
    }

    @Override
    public float calculaBonus() {
        return this.salarioBase * 0.3f;
    }

    @Override
    public String toString() {
        return "\nSenior {" +
                super.toString() +
                "\nVerba líder: R$" + getVerbaLider() + "\n}\n";
    }
}
