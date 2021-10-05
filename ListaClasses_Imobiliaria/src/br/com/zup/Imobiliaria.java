package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> listaImoveis = new ArrayList<>();

    //    Métodos construtores
    public Imobiliaria() {
    }

    public Imobiliaria(List<Imovel> listaImoveis) {
        this.listaImoveis = listaImoveis;
    }

    //    Getters e setters
    public List<Imovel> getListaImoveis() {
        return listaImoveis;
    }

    public void setListaImoveis(List<Imovel> listaImoveis) {
        this.listaImoveis = listaImoveis;
    }

    @Override
    public String toString() {
        StringBuilder exibirCatalogo = new StringBuilder();
        exibirCatalogo.append(this.listaImoveis);
        return exibirCatalogo.toString();
    }

}




