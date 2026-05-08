public class Email extends CanalNotificacao {
    private String assunto;

    public Email() {
        super();
    }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.printf("\nEnviando E-mail para %s com o assunto '%s', mensagem: '%s'", this.getDestinatario(), this.getAssunto(), this.getMensagem());
    }

    @Override
    public String toString() {
        return "\n| Email |" +
                super.toString() +
                "\nAssunto: " + this.getAssunto();
    }
}
