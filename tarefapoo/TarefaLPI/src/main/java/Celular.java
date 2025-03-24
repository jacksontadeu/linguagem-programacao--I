import java.util.Timer;

public class Celular {
    private String nome;
    private String modelo;
    private String marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void fazerLigacao(){
        System.out.println("Fazendo ligacao....");
    }
    public void tocarMusica(){
        System.out.println("Tocando musica....");
    }
    public void instalarApp(String app) throws InterruptedException {
        System.out.printf("Instalando %s \n", app);
        Thread.sleep(2000);
        System.out.println("App instalado com sucesso");
    }
}
