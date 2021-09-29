package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Ingrediente {
    private String nome;
    private List <TabelaNutricional> tabelaNutricional = new ArrayList<>();

    //  Métodos contrutores
    public Ingrediente() {
    }

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    //  Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<TabelaNutricional> getTabelaNutricional() {
        return tabelaNutricional;
    }

    public void setTabelaNutricional(List<TabelaNutricional> tabelaNutricional) {
        this.tabelaNutricional = tabelaNutricional;
    }

    @Override
    public String toString (){
        StringBuilder exibirIngrediente = new StringBuilder();

        exibirIngrediente.append("Ingrediente: " +nome);
        exibirIngrediente.append(tabelaNutricional);

        return  exibirIngrediente.toString();
    }

}
