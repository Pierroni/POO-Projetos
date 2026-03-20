public class Aluno {
    private int id;
    private String nome, ra, curso;

    public Aluno() {
    }

    public Aluno(int id, String nome, String ra, String curso) {
        this.setId(id);
        this.setNome(nome);
        this.setRa(ra);
        this.setCurso(curso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("\nID Aluno: %s\nNome: %s\nRA: %s\nCurso matriculado: %s\n",
                getId(), getNome(), getRa(), getCurso());
    }
}