package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private String nomePrato;
    private double valorPrato;

    //  Métodos contrutores
    public Prato() {
    }

    public Prato(String nomePrato, double valorPrato) {
        this.nomePrato = nomePrato;
        this.valorPrato = valorPrato;
    }

    //  Métodos getters e setters
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(double valorPrato) {
        this.valorPrato = valorPrato;
    }

    @Override
    public String toString (){
        StringBuilder exibirIngrediente = new StringBuilder();

        exibirIngrediente.append("\n O prato : " +nomePrato);
        exibirIngrediente.append("\n Custa R$ " +valorPrato);
        exibirIngrediente.append("\n É composto por : " +ingredientes.size() +" ingredientes");
        exibirIngrediente.append("\n São eles: " +ingredientes);

        return  exibirIngrediente.toString();
    }
}
