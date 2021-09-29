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
        System.out.println("\n 1- Cadastrar um prato \n 2- Exibir os pratos \n 3- Excluir um prato \n 4- Sair \n");
    }

    //  Método para cadastrar um cardápio
    public static Cardapio cadastrarCardapio() {
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarPrato(cadastrarPrato());
        return cardapio;
    }

    //  Método para cadastrar um prato
    public static Prato cadastrarPrato() {
        String nomePrato = receberDados("Nome do prato: ").nextLine();
        double valorPrato = receberDados("Valor do prato: ").nextDouble();
        Prato pratos = new Prato(nomePrato, valorPrato);
//        pratos.adicionarIngrediente(cadastrarIngredientes());
        return pratos;
    }

    //  Método para cadastrar ingredientes
    public static Ingrediente cadastrarIngredientes() {
        String nome = receberDados("Nome do ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente(nome);
//        ingrediente.adicionarTabela(cadastrarTabela());
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

    //  Método para exibir pratos
    public static void exibirPrato() {
        Cardapio cardapio = new Cardapio();
        System.out.println(cardapio);
    }

    //  Método para excluir pratos
    public static void excluirPratos() {
        Cardapio cardapio = new Cardapio();
        System.out.println(cardapio);
    }

    //  Método para instanciar as classes
    public static void todasAsClasses() {
        Cardapio cardapio = new Cardapio();
        Prato pratos = new Prato();
        Ingrediente ingredientes = new Ingrediente();
        TabelaNutricional tabela = new TabelaNutricional();

        ingredientes.adicionarTabela(tabela);
        pratos.adicionarIngrediente(ingredientes);
        cardapio.adicionarPrato(pratos);
    }

    //  Método para executar menu
    public static void menuInicial() {
        boolean menu = true;

        while (menu) {

            menu();
            int opcaoEscolhida = receberDados("Digite sua opção: ").nextInt();

            switch (opcaoEscolhida) {

                case 1:
                    todasAsClasses();
                    cadastrarPrato();

                    int qtdIngredientes = receberDados("Quer cadastrar quantos ingredientes? ").nextInt();
                    for (int i = 0; i < qtdIngredientes; i++) {
                        cadastrarIngredientes();
                        cadastrarTabela();
//                        Prato pratos = new Prato();
//                        Cardapio cardapio = new Cardapio();
//                        cardapio.adicionarPrato(pratos);
                    }
                    break;

                case 2:
                    exibirPrato();
                    break;

                case 3:
//                    Prato pratos = new Prato();
//                    Cardapio cardapio = new Cardapio();
//                    cardapio.excluirPrato(pratos);

                    break;

                case 4:
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
