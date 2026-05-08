public abstract class CanalNotificacao {
    protected String destinatario, mensagem;

    public CanalNotificacao() {
    }

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void exibirDados() {
        System.out.printf("\nDestinatário: %s\nMensagem: %s", this.getDestinatario(), this.getMensagem());
    }

    public abstract void enviar();

    @Override
    public String toString() {
        return "\n| CanalNotificacao |" +
                "\nDestinatario: " + this.getDestinatario() +
                "\nMensagem: " + this.getMensagem();
    }
}