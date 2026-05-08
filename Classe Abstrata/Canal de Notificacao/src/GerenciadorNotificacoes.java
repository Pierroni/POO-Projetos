import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void enviarMensagem(CanalNotificacao canalDesejado) {
        canalDesejado.enviar(); // Polimorfismo
    }

    public static void main(String[] args) {
        ArrayList<CanalNotificacao> canaisNotificacao = new ArrayList<>();

        canaisNotificacao.add(new Email("Lucas", "Vai ter que fazer o motor...", "Revisão PNEU Pálio"));
        canaisNotificacao.add(new Sms("Amanda", "Me liga", 991234567));
        canaisNotificacao.add(new WhatsApp("Robson", "Já saiu seu resultado do exame de sangue...", "Não lido"));

        for (CanalNotificacao canal : canaisNotificacao) {
            enviarMensagem(canal);
        }
    }
}
