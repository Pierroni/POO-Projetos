public class Paciente {
    private String id, nome, cpf;

    public Paciente() {
    }

    public Paciente(String id, String nome, String cpf) {
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "id: " + getId() +
                "\nNome: " + getNome() +
                "\nCpf: " + getCpf();
    }
}