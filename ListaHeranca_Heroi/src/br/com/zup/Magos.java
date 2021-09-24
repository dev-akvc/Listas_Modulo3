package br.com.zup;

public class Magos extends Heroi {
    private double poderMagico;

    //    Método construtor
    public Magos() {

    }

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    //    Método solicitado
    public double aplicarMagia() {
        return poderMagico;
    }

    //    Setter que falta
    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }
}
