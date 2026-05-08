public class Camera extends DispositivoSeguranca implements DispositivoConectado {
    private String resolucao;

    public Camera() {
        super();
    }

    public Camera(String localizacao, boolean ativo, String resolucao) {
        super(localizacao, ativo);
        this.resolucao = resolucao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public void dispararAlerta() {
        System.out.printf("%nGravando imagens em alta definição de %s e enviando para a central%n", this.getLocalizacao());
    }

    @Override
    public void conectarWiTone() {
        System.out.println("%nCâmera conectada via protocolo seguro SSL");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Realizando autodiagnóstico da câmera...");
    }

    @Override
    public String toString() {
        return "\n-- Câmera:" +
                "\nResolução: " + this.getResolucao() +
                super.toString();
    }
}
