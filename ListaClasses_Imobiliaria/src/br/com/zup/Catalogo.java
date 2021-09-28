package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
    private List<Imovel> listaImoveis = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);
    private String menuInicial;
    private boolean opcao = true;
    private int opcaoEscolhida;
    private Imovel novoImovel;

    //    Métodos construtores
    public Catalogo() {
    }

    public Catalogo(Scanner entrada, String menuInicial, boolean opcao, int opcaoEscolhida, Imovel novoImovel) {
        this.entrada = entrada;
        this.menuInicial = menuInicial;
        this.opcao = opcao;
        this.opcaoEscolhida = opcaoEscolhida;
        this.novoImovel = novoImovel;
    }

    //    Getters e setters
    public List<Imovel> getListaImoveis() {
        return listaImoveis;
    }

    public void setListaImoveis(List<Imovel> listaImoveis) {
        this.listaImoveis = listaImoveis;
    }

    //    Método para adicionar imóveis
    public void adicionarImoveis(Imovel novoImovel) {
        listaImoveis.add(novoImovel);
    }

    public void removerImoveis(Imovel novoImovel) {
        listaImoveis.remove(novoImovel);
    }

    @Override
    public String toString() {
        StringBuilder exibirCatalogo = new StringBuilder();
        exibirCatalogo.append(this.listaImoveis);

        return exibirCatalogo.toString();
    }

    public void menuInicial() {

        while (opcao) {
            System.out.println("=== Bem vindo(a) ao cadastro de imóveis === \n");
            System.out.println("Digite:\n 1- Exibir imóveis \n 2- Cadastrar imóveis \n 3- Excluir imóveis \n 4- Sair do menu");
            opcaoEscolhida = entrada.nextInt();

            if (opcaoEscolhida == 1) {
                if (listaImoveis.size() >= 1) {
                    System.out.println(listaImoveis);
                } else {
                    System.out.println("Lista vazia.");
                }
            } else if (opcaoEscolhida == 2) {
                System.out.println("Informe os dados do imóvel: ");

                public void adicionarImoveis (Imovel novoImovel){
                    listaImoveis.add(novoImovel);
                }
                System.out.println("Imóvel cadastrado.");
            } else if (opcaoEscolhida == 3) {
                System.out.println("Informe os dados do imóvel: ");
                this.getListaImoveis();

                this.removerImoveis();
                System.out.println("Imóvel removido.");
            } else if (opcaoEscolhida == 4) {
                opcao = false;
                System.out.println("Menu encerrado.");
            } else {
                System.out.println("Digite uma opção válida.\n");
            }
        }
    }

}




