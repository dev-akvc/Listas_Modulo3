package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private String nomePrato;

    //  Métodos contrutores
    public Prato() {
    }

    public Prato(List<Ingrediente> ingredientes, String nomePrato) {
        this.ingredientes = ingredientes;
        this.nomePrato = nomePrato;
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
}
