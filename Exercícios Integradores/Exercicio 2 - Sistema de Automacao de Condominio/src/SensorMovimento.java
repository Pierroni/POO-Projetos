public class SensorMovimento extends DispositivoSeguranca implements DispositivoConectado {
    private double sensibilidade;

    public SensorMovimento() {
        super();
    }

    public SensorMovimento(String localizacao, boolean ativo, double sensibilidade) {
        super(localizacao, ativo);
        this.sensibilidade = sensibilidade;
    }

    public double getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(double sensibilidade) {
        this.sensibilidade = sensibilidade;
    }

    @Override
    public void dispararAlerta() {
        System.out.printf("%nMovimento detectado em %s. Acionando luzes de emergência%n", this.getLocalizacao());
    }

    @Override
    public void conectarWiTone() {
        System.out.println("%nSensor conectado via rádio frequência 433MHz");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Realizando autodiagnóstico do sensor de movimento...");
    }

    @Override
    public String toString() {
        return "\n-- Sensor de Movimento:" +
                "\nSensibilidade: " + this.getSensibilidade() + "m" +
                super.toString();
    }
}
