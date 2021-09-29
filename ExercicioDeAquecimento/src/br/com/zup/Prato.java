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

    public void adicionarIngrediente(Ingrediente novoIngrediente) {
        ingredientes.add(novoIngrediente);
    }

    public void excluirIngrediente(Ingrediente novoIngrediente) {
        ingredientes.remove(novoIngrediente);
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
