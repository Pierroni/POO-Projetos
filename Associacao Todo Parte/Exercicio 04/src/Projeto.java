import java.util.ArrayList;

public class Projeto {
    private String id, nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto() {
        this.programadores = new ArrayList<>();
    }

    public Projeto(String id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }

    public void contratarProgramador(Programador prog) {
        this.programadores.add(prog);
    }

    public void listarProgramadores() {
        if (this.programadores == null || this.programadores.isEmpty()) {
            System.out.println("\nNão há programadores alocados neste projeto.");
            return;
        }
        System.out.printf("\nProgramadores atuando no projeto %s:", this.getNomeProjeto());
        for (Programador programador : this.programadores) {
            System.out.println(programador);
        }
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id='" + getId() + '\'' +
                ", nomeProjeto='" + getNomeProjeto() + '\'' +
                ", programadores=" + programadores +
                '}';
    }
}