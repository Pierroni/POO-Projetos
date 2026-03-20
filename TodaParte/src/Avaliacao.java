import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }

    public Avaliacao() {
        this.questoes = new ArrayList<>();
    }

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    // Adicionar questões na avaliação
    // Composição - Questões dependem da avaliação para serem criadas
    public void adicionarQuestao(int num, String texto, float peso) {
        Questao aux = new Questao(num, texto, peso);
        this.questoes.add(aux);
    }

    @Override
    public String toString() {
        return "\nID Avaliação: " + getId() +
                "\nNome: " + getNome() +
                "\n\n    QUESTÕES =" + getQuestoes();
    }
}