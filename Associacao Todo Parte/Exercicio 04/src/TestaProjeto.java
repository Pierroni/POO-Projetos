public class TestaProjeto {
    public static void main(String[] args) {
        Programador programador1 = new Programador("12345", "João", "Java");
        Programador programador2 = new Programador("54321", "Lucas", "Python");
        Programador programador3 = new Programador("12543", "Livia", "COBOL");
        System.out.println(programador1);

        Projeto proj1 = new Projeto("789", "Convivência ACITY");

        proj1.listarProgramadores();

        proj1.contratarProgramador(programador1);
        proj1.contratarProgramador(programador2);
        proj1.contratarProgramador(programador3);

        proj1.listarProgramadores();
    }
}