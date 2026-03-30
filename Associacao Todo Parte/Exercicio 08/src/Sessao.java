import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime horario;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, int sala, LocalDateTime horario) {
        this.id = id;
        this.sala = sala;
        this.horario = horario;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso novoIngresso = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(novoIngresso);
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        String dataFormatada = horario.format(dtf);

        String separador = "------------------------------------------------------------";

        String infoSessao = String.format(
                "%s\nSESSÃO: %d | SALA: %d | HORÁRIO: %s\n%s\nFILME: %s (%s) - %d min\n%s\n",
                separador, getId(), getSala(), dataFormatada, separador,
                filme.getTitulo(), filme.getGenero(), filme.getDuracao(), separador
        );

        String listaIngressos = "INGRESSOS: " + ingressos.size() + " vendidos\n";
        for (Ingresso i : ingressos) {
            listaIngressos += " - " + i + "\n";
        }

        return infoSessao + listaIngressos + separador;
    }
}