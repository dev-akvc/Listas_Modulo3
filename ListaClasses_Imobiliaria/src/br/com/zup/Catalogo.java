package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
    private List<Imovel> listaImoveis = new ArrayList<>();

    //    Métodos construtores
    public Catalogo() {
    }

    public Catalogo(List<Imovel> listaImoveis) {
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




