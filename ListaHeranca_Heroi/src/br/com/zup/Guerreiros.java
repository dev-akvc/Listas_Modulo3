package br.com.zup;

public class Guerreiros extends Heroi {
    private double poderAtaque;

    //    Métodos construtores
    public Guerreiros() {
    }

    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    //    Setter que falta
    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    //    Método solicitado
    public double aplicarDano() {
        return poderAtaque;
    }
}
