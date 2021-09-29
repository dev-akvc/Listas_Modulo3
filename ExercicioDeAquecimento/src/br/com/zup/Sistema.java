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
        System.out.println("\n 1- Cadastrar um prato \n 2- Exibir o cardápio \n 3- Excluir um prato \n 4- Sair \n");
    }

    // Instanciando as classes
    Cardapio cardapio = new Cardapio();
    Prato pratos = new Prato();
    Ingrediente ingredientes = new Ingrediente();
    TabelaNutricional tabela = new TabelaNutricional();

    //    Instanciando listas
    public static List<Cardapio> listaCardapio = new ArrayList<>();
    public static List<Prato> listaPrato = new ArrayList<>();
    public static List<Ingrediente> listaIngredientes = new ArrayList<>();
    public static List<TabelaNutricional> listaTabelas = new ArrayList<>();


    //  Método para cadastrar um cardápio
    public static List<Cardapio> cadastrarCardapio() {
        Cardapio cardapio = new Cardapio();
        listaCardapio.add(cardapio);
        return listaCardapio;
    }

    //  Método para cadastrar um prato
    public static List<Prato> cadastrarPrato() {
        String nomePrato = receberDados("Nome do prato: ").nextLine();
        double valorPrato = receberDados("Valor do prato: ").nextDouble();
        Prato pratos = new Prato(nomePrato, valorPrato);
        listaPrato.add(pratos);
        cadastrarIngredientes();
        return listaPrato;
    }

    //  Método para cadastrar ingredientes
    public static List<Ingrediente> cadastrarIngredientes() {
        int qtdIngredientes = receberDados("Quer cadastrar quantos ingredientes? ").nextInt();
        for (int i = 0; i < qtdIngredientes; i++) {
        String nome = receberDados("Nome do ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente(nome);
        listaIngredientes.add(ingrediente);
        cadastrarTabela();
        }
        return listaIngredientes;
    }

    //  Método para cadastrar tabela nutricional
    public static List<TabelaNutricional> cadastrarTabela() {
        double valorEnergetico = receberDados("Tem quantas calorias? ").nextDouble();
        double proteinas = receberDados("Tem quantos gramas de proteína? ").nextDouble();
        double carboidratos = receberDados("Tem quantos gramas de carboidratos? ").nextDouble();
        double fibraAlimentar = receberDados("Tem quantos gramas de fibra alimentar? ").nextDouble();
        TabelaNutricional tabela = new TabelaNutricional(valorEnergetico, proteinas, carboidratos, fibraAlimentar);
        listaTabelas.add(tabela);
        return listaTabelas;
    }

    //  Método para exibir pratos
    public static void exibirPrato() {
        System.out.println(listaPrato);
    }

    //  Método para excluir pratos
    public static void excluirPratos() {
        listaCardapio.remove(listaPrato);
        System.out.println(listaCardapio);
    }


//        ingredientes.adicionarTabela(tabela);
//        pratos.adicionarIngrediente(ingredientes);
//        cardapio.adicionarPrato(pratos);


    //  Método para executar menu
    public static void menuInicial() {
        boolean menu = true;

        while (menu) {

            menu();
            int opcaoEscolhida = receberDados("Digite sua opção: ").nextInt();

            switch (opcaoEscolhida) {

                case 1:
                    cadastrarPrato();
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
