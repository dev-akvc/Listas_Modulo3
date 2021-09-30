package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    //  Método para automatizar entrada de dados
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //  Método para exibir menu
    public static void menu() {
        System.out.println("\n ** Restaurante VemComFome ** ");
        System.out.println("\n 1- Cadastrar um prato \n 2- Exibir o cardápio \n 3- Sair \n");
    }

    //  Método para cadastrar um prato
    public static Prato cadastrarPrato() {
        String nomePrato = receberDados("Nome do prato: ").nextLine();
        double valorPrato = receberDados("Valor do prato: ").nextDouble();
        Prato prato = new Prato(nomePrato, valorPrato);
        return prato;
    }

    //  Método para cadastrar ingredientes
    public static Ingrediente cadastrarIngredientes() {
        String nome = receberDados("Nome do ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente(nome);
        return ingrediente;
    }

    //  Método para cadastrar tabela nutricional
    public static TabelaNutricional cadastrarTabela() {
        double valorEnergetico = receberDados("Tem quantas calorias? ").nextDouble();
        double proteinas = receberDados("Tem quantos gramas de proteína? ").nextDouble();
        double carboidratos = receberDados("Tem quantos gramas de carboidratos? ").nextDouble();
        double fibraAlimentar = receberDados("Tem quantos gramas de fibra alimentar? ").nextDouble();
        TabelaNutricional tabela = new TabelaNutricional(valorEnergetico, proteinas, carboidratos, fibraAlimentar);
        return tabela;
    }

    //  Método para executar menu
    public static void menuInicial() {
        boolean menu = true;
        Cardapio cardapio = new Cardapio();

        while (menu) {

            menu();
            int opcaoEscolhida = receberDados("Digite sua opção: ").nextInt();

            switch (opcaoEscolhida) {

                case 1:

                    boolean realizarCadastro = true;
                    while (realizarCadastro) {
                        int novoPrato = receberDados("Deseja cadastrar um prato?\n 1- Sim \n 2- Não ").nextInt();
                        if (novoPrato == 1) {
                            Prato prato = cadastrarPrato();
                            cardapio.adicionarPrato(prato);

                            int qtdIngredientes = receberDados("Tem quantos ingredientes?").nextInt();
                            for (int i = 0; i < qtdIngredientes; i++) {
                                Ingrediente ingrediente = cadastrarIngredientes();
                                TabelaNutricional tabela = cadastrarTabela();

                                prato.adicionarIngrediente(ingrediente);
                                ingrediente.adicionarTabela(tabela);
                            }
                        }
                        if (novoPrato == 2) {
                            realizarCadastro = false;
                        }
                    }

                    break;

                case 2:
                    System.out.println(cardapio);
                    break;

                case 3:
                    System.out.println(" * Bye * ");
                    menu = false;
                    break;

                default:
                    System.out.println(" * Digite opção válida * ");
                    break;
            }
        }
    }

}
