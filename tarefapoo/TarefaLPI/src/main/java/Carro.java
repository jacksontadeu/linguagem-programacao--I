public class Carro {

    private String nome;
    private String cor;
    private int anoFabricacao;
    private int velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void ligarCarro(){
        System.out.println("Ligando o carro....");
    }
    public int acelerarCarro(){
        System.out.println("Acelerando o carro....");
        this.velocidade += 10;
        System.out.printf("Velocidde atual: %d \n", this.velocidade);
        return this.velocidade;
    }
    public void frearCarro(){

        if (this.velocidade > 0){
            for(int i = this.velocidade; i > 0; i-=10){
                System.out.println("Freando o carro....");
                System.out.printf("Velocidde atual: %d \n", this.velocidade);
                this.velocidade -= 10;
            }
            System.out.println("Carro parado");

        }
    }
}
