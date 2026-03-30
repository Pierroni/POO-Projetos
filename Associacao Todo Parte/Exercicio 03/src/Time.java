import java.util.ArrayList;

public class Time {
    private String id, nome, tecnico;
    private ArrayList<Atleta> atletas;

    public Time() {
        this.atletas = new ArrayList<>();
    }

    public Time(String id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void contratarAtleta(Atleta a){
        this.atletas.add(a);
    }

    @Override
    public String toString() {
        return "Time" +
                "\nid: " + getId() +
                "\nNome: " + getNome() +
                "\nTécnico: " + getTecnico() +
                "\n\nAtletas: "+ atletas;
    }
}