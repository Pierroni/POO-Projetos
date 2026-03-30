import java.time.LocalDateTime;

public class TestaEmprestimo {
    public static void main(String[] args) {

        Leitor leitor1 = new Leitor("12345", "João");
        Livro livro1 = new Livro("987654", "A volta dos que não foram", "Jim Carrey");

        LocalDateTime dataEmp = LocalDateTime.of(2026, 3, 15, 12, 30);
        LocalDateTime dataDev = LocalDateTime.of(2026, 5, 15, 12, 30);
        Emprestimo emp1 = new Emprestimo(dataEmp, dataDev, leitor1, livro1);

        System.out.println(emp1);
    }
}