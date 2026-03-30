public class Computador {
    private String id, marca;
    private Processador processador;

    public Computador() {
    }

    public Computador(String id, String marca, String marcaProc, String modeloProc, String frequenciaProc) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProc, modeloProc, frequenciaProc);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return "Computador" +
                "\nid: " + getId() +
                "\nMarca: " + getMarca() +
                "\nProcessador:\n" + getProcessador();
    }
}