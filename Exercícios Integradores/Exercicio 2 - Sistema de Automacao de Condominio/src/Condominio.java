import java.util.ArrayList;

public class Condominio {
    private String nome;
    private ArrayList<DispositivoSeguranca> dispositivos = new ArrayList<>();

    public Condominio() {
    }

    public Condominio(String nome, ArrayList<DispositivoSeguranca> dispositivos) {
        this.nome = nome;
        this.dispositivos = dispositivos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDispositivo(DispositivoSeguranca d) {
        dispositivos.add(d);
    }

    public void exibirInformacoes() {
        System.out.println("\n===| INFORMAÇÕES DOS DISPOSITIVOS |===");
        for (DispositivoSeguranca dispositivo : dispositivos) {
            System.out.println(dispositivo.toString());
        }
    }

    public void testeGeralSeguranca() {
        System.out.println("\n===| TESTE DE SEGURANÇA DOS DISPOSITIVOS |===");
        for (DispositivoSeguranca dispositivo : dispositivos) {
            dispositivo.dispararAlerta();
            if (dispositivo instanceof DispositivoConectado) {
                ((DispositivoConectado) dispositivo).realizarAutodiagnostico();
            }
        }
    }
}
