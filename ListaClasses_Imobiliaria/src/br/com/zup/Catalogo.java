package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
    Scanner entrada = new Scanner(System.in);
    private List<Imovel> listaImoveis = new ArrayList<>();
    private String menuInicial;
    private boolean opcao = true;
    private int opcaoEscolhida;

    //    Getters e setters
    public String getMenuInicial() {
        return menuInicial;
    }

    public void setMenuInicial(String menuInicial) {
        this.menuInicial = menuInicial;
    }

    @Override
    public String toString() {
        return listaImoveis.toString();
    }

    public List<Imovel> getListaImoveis() {
        return listaImoveis;
    }

    public void setListaImoveis(List<Imovel> listaImoveis) {
        this.listaImoveis = listaImoveis;
    }

    public void imprimirLista() {
        for (Imovel imovel : this.getListaImoveis()) {
            System.out.println(imovel);
        }
    }

    public void menuInicial() {
        System.out.println("=== Bem vindo(a) ao cadastro de imóveis ===");
        System.out.println("Digite:\n 1- Exibir imóveis \n 2- Cadastrar imóveis \n 3- Excluir imóveis \n 4- Sair do menu");
        opcaoEscolhida = entrada.nextInt();

        while (opcao) {
            switch (opcaoEscolhida) {
                case 1:

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    opcao = false;
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;

            }

        }
    }

}
