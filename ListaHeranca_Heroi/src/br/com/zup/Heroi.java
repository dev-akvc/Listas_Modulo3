package br.com.zup;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public double getVida() {
        return vida;
    }

//    public void setVida(double vida) {
//        this.vida = vida;
//    }

    public String trocarNome(String nome){
        this.nome = nome;
        return "Novo nome é " +nome;
    }

    public double receberDano(double dano){
        double vida = getVida() - dano;
        return vida;
    }

    public double exibirVida(){
        return getVida();
    }
}
