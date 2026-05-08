// CLASSE PAI
public class Desenvolvedor {
    protected String nome, linguagem;
    protected float salarioBase;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String linguagem, float salarioBase) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void codar() {
        System.out.println("\nDesenvolvedor criando código...");
    }

    public float calculaBonus() {
        return this.salarioBase * 0.05f;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor " + getNome() +
                "\nLinguagem: " + getLinguagem() +
                "\nSalário base: R$" + getSalarioBase();
    }
}