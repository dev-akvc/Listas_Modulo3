package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> pratos = new ArrayList<>();

    public void adicionarPrato(Prato novoPrato) {
        pratos.add(novoPrato);
    }

    public void excluirPrato(Prato novoPrato) {
        pratos.remove(novoPrato);
    }

    @Override
    public String toString() {
        StringBuilder pratosDisponiveis = new StringBuilder();

        pratosDisponiveis.append(" * Cardápio *");
        pratosDisponiveis.append("\n Prato : " + pratos);

        return pratosDisponiveis.toString();
    }

}
