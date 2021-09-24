package br.com.zup;

public class Voadores extends Inimigos {
    private double danoTiro;

    //    Método construtor
    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    //    Método solicitado
    public double aplicarDano() {
        return danoTiro;
    }

    //    Setter que falta
    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }
}
