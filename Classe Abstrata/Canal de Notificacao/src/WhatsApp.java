public class WhatsApp extends CanalNotificacao {
    private String statusLeitura;

    public WhatsApp() {
        super();
    }

    public WhatsApp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        System.out.printf("\nEnviando Zap para %s... Mensagem: '%s'", this.getDestinatario(), this.getMensagem());
    }

    @Override
    public String toString() {
        return "\n| WhatsApp |" +
                super.toString() +
                "\nStatus de leitura: " + this.getStatusLeitura() ;
    }
}
