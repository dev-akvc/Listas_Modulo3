package br.com.zup;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    private Morador moradores;
    private String corretor;

    //    Métodos construtores
    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, Morador moradores, String corretor) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.moradores = moradores;
        this.corretor = corretor;
    }

    //    Getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Morador getMoradores() {
        return moradores;
    }

    public void setMoradores(Morador moradores) {
        this.moradores = moradores;
    }

    public String getCorretor() {
        return corretor;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }


}
