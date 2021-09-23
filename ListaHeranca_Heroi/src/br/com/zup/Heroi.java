package br.com.zup;

public class Heroi {
    private String nome;
    private double vida;

//    Métodos construtores
    public Heroi() {
    }

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

//    Métodos solicitados
    public void trocarNome(String nome) {
        this.nome = nome;
    }

    public void receberDano(double dano) {
        this.vida -= dano;
    }

    public double exibirVida() {
        return this.vida;
    }

//    Getter que falta
    public String getNome() {
        return nome;
    }
}
