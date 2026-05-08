public class Sms extends CanalNotificacao {
    private int nroTelefone;

    public Sms() {
        super();
    }

    public Sms(String destinatario, String mensagem, int nroTelefone) {
        super(destinatario, mensagem);
        this.nroTelefone = nroTelefone;
    }

    public int getNroTelefone() {
        return nroTelefone;
    }

    public void setNroTelefone(int nroTelefone) {
        this.nroTelefone = nroTelefone;
    }

    @Override
    public void enviar() {
        System.out.printf("\nEnviando SMS para o número %d: '%s'", this.getNroTelefone(), this.getMensagem());
    }

    @Override
    public String toString() {
        return "\n| SMS |" +
                super.toString() +
                "\nN° de Telefone: " + this.getNroTelefone();
    }
}
