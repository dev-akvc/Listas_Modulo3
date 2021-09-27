package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    private String corretor;
    private List <Morador> moradores = new ArrayList<>();

    //    Métodos construtores
    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, String corretor) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
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

    public String getCorretor() {
        return corretor;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }


}
