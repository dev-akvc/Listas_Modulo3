package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //  Método para automatizar entrada de dados
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //  Método para exibir menu
    public static void menu() {
        System.out.println(" ** Restaurante VemComFome ** ");
        System.out.println("Digite: \n 1- Cadastrar um prato \n 2- Exibir os pratos \n 3- Excluir um prato \n 4- Sair");
    }

    //  Método para cadastrar um prato
    public static Prato cadastrarPrato() {
        String nomePrato = receberDados("Nome do prato: ").nextLine();
        double valorPrato = receberDados("Valor do prato: ").nextDouble();
        Prato pratos = new Prato(nomePrato, valorPrato);
        return pratos;
    }

    //  Método para cadastrar ingredientes
    public static Ingrediente cadastrarIngredientes() {
        String nome = receberDados("Nome do ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente();
        return ingrediente;
    }

    //  Método para cadastrar tabela nutricional
    public static TabelaNutricional cadastrarTabela() {
        double valorEnergetico = receberDados("Tem quantas calorias? ").nextDouble();
        double proteinas = receberDados("Tem quantos gramas de proteína? ").nextDouble();
        double carboidratos = receberDados("Tem quantos gramas de carboidratos? ").nextDouble();
        double fibraAlimentar = receberDados("Tem quantos gramas de fibra alimentar? ").nextDouble();
        TabelaNutricional tabela = new TabelaNutricional();
        return tabela;
    }


}
