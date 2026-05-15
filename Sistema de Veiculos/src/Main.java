//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aviao aviao = new Aviao("boieng", "f-560", 500, 600);
        CarroEletrico carro = new CarroEletrico("BYD", "song plus", 120, 1000);

        Veiculo apontar;

        apontar = aviao;
        apontar.mover();

        apontar = carro;
        apontar.mover();

    }
}