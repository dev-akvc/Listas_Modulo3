package br.com.zup;

public class Guerreiros extends Heroi{
    private double poderAtaque;

    public Guerreiros(String nome, double vida) {
        super(nome, vida);
    }

    public double aplicarDano(){
        return poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
}
