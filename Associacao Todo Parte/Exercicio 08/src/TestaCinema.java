import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme filme1 = new Filme(1, "Coringa", "Ação", 180);
        Filme filme2 = new Filme(1, "Indiana Jones", "Aventura", 170);

        LocalDateTime data = LocalDateTime.of(2026,7,20,20, 0);
        Sessao s1 = new Sessao(5, 4, data);
        s1.vincularFilme(filme1);

        s1.venderIngresso(137, "A1", "Inteira", 25);
        s1.venderIngresso(178, "A2", "Meia", 17.5f);
        s1.venderIngresso(179, "A3", "Inteira", 17.5f);

        System.out.println(s1);
    }
}