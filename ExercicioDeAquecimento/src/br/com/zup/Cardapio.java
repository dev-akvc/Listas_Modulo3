package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> pratos = new ArrayList<>();

    public void adicionarPrato(Prato novoPrato) {
        pratos.add(novoPrato);
    }

    @Override
    public String toString (){
        StringBuilder pratosDisponiveis = new StringBuilder();

        pratosDisponiveis.append(" * Cardápio *");
        pratosDisponiveis.append("\n Prato : " +pratos);

        return  pratosDisponiveis.toString();
    }

}
