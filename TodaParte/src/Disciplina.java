import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    // Esse construtor caracteriza uma agregação
    // Motivo: aluno já veio criado, é independente
    public Disciplina(int id, String nome, String professor) {
        this.setId(id);
        this.setNome(nome);
        this.setProfessor(professor);
        this.setAlunos(new ArrayList<>());
        this.setAvaliacoes(new ArrayList<>());
    }

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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    // Getter útil para acessar avaliação depois
    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    // AGREGAÇÃO
    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    // COMPOSIÇÃO
    public void criarAvaliacao(int id, String nome) {
        Avaliacao av = new Avaliacao(id, nome);
        this.avaliacoes.add(av);
    }

    @Override
    public String toString() {
        return String.format("\nId Disciplina: %s\nNome: %s\nProfessor: %s\n\nAlunos: %s\n\nAvaliações =%s",
                getId(), getNome(), getProfessor(), getAlunos(), getAvaliacoes());
    }
}