public class Medico {
    private String id, nome, especialidade;

    public Medico() {
    }

    public Medico(String id, String nome, String especialidade) {
        this.setId(id);
        this.setNome(nome);
        this.setEspecialidade(especialidade);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "\nid: " + getId() +
                "\nNome: " + getNome() +
                "\nEspecialidade: " + getEspecialidade();
    }
}