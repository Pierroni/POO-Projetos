// CLASSE FILHA OU SUBCLASSE
public class Pleno extends Desenvolvedor {
    private int projetosEntregues;

    public Pleno() {
        super();
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projetosEntregues) {
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = projetosEntregues;
    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }

    @Override
    public void codar() {
        System.out.println("\nPleno codando e fazendo Code Review");
    }

    @Override
    public float calculaBonus() {
        return this.salarioBase * 0.15f;
    }

    @Override
    public String toString() {
        return "\nPleno {" +
                super.toString() +
                "\nProjetos entregues: " + getProjetosEntregues() + "\n}\n";
    }
}
