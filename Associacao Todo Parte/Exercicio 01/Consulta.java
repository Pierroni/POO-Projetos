import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data; // dia, mês, ano, hora e minuto
    private float valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, float valorDaConsulta, Medico medico, Paciente paciente) {
        this.setData(data);
        this.setValorDaConsulta(valorDaConsulta);
        this.setMedico(medico);
        this.setPaciente(paciente);
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(float valorDaConsulta) {
        if (valorDaConsulta > 0) {
            this.valorDaConsulta = valorDaConsulta;
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH'h'm");
        return "Consulta" +
                "\nData: " + data.format(formatoBr) +
                "\nValor da Consulta: R$" + getValorDaConsulta() +
                "\n\nMédico: " + getMedico() +
                "\n\nPaciente: " + getPaciente();
    }
}