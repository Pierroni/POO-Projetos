public abstract class DispositivoSeguranca {
    protected String localizacao;
    protected boolean ativo;

    public DispositivoSeguranca() {
    }

    public DispositivoSeguranca(String localizacao, boolean ativo) {
        this.localizacao = localizacao;
        this.ativo = ativo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void status() {
        System.out.printf("%nLocalização do dispositivo: %s%nStatus: %s", this.getLocalizacao(), this.isAtivo());
    }

    public abstract void dispararAlerta();

    @Override
    public String toString() {
        return "\nLocalização: " + this.getLocalizacao() +
                "\nStatus: " + (this.isAtivo() ? "Ativado" : "Desativado");
    }
}
