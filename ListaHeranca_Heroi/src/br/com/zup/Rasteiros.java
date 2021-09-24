package br.com.zup;

public class Rasteiros extends Inimigos {
    private double danoEspinho;

    //    Método construtor
    public Rasteiros(String nome, double vida, double danoEspinho) {
        super(nome, vida);
        this.danoEspinho = danoEspinho;
    }

    //    Método solicitado
    public double aplicarDano(){
        return danoEspinho;
    }

    //    Setter que falta
    public void setDanoEspinho(double danoEspinho) {
        this.danoEspinho = danoEspinho;
    }
}
