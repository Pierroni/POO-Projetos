import java.time.LocalDateTime;

public class TestaConsulta {
    public static void main(String[] args) {
        Medico med1 = new Medico("123789", "Álvaro Lucero", "Cardiologia");
        Paciente p1 = new Paciente("789123", "Lucas Silva", "123456789");

        LocalDateTime data = LocalDateTime.of(2026,5,10,12,30);
        Consulta c1 = new Consulta(data, 155f, med1, p1);
        System.out.println(c1);
    }
}