package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Sistema {
    static Imobiliaria imobiliaria = new Imobiliaria();
    static List<Imobiliaria> listaImobiliaria = new ArrayList<>();
    static List<Imovel> listaImoveis = new ArrayList<>();
    static Imovel novoImovel = new Imovel();
    static List<Morador> listaMoradores = new ArrayList<>();


    //    Método para automatizar entrada de dados (instancia o Scanner)
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuInicial() {
        System.out.println("=== Bem vindo(a) ao cadastro de imóveis === \n");
        System.out.println("=== Menu ===\n 1- Exibir imóveis \n 2- Cadastrar imóveis \n 3- Sair do menu\n");
    }

    public static boolean validarCpf(Imobiliaria imobiliaria, Morador morador) {
        //Percorrer lista de imóveis
        for (Imovel imovelReferencia : imobiliaria.getListaImoveis()) {
            //Percorrer todas as listas de moradores
            for (Morador moradorReferencia : imovelReferencia.getMoradores()) {
                if (moradorReferencia.getCpf().equals(morador.getCpf())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Morador receberDadosMoradores() {
        String nome = capturarDados("Informe o nome do morador: ").nextLine();
        String cpf = capturarDados("Informe o CPF: ").nextLine();
        String ocupacao = capturarDados("Informe a ocupação: ").nextLine();
        Morador morador = new Morador(nome, cpf, ocupacao);

        return morador;
    }

    public static void cadastrarListaMoradores(Imobiliaria imobiliaria, Imovel imovel) {

        boolean novosMoradores = true;

        while (novosMoradores) {

            Morador morador = receberDadosMoradores();
            boolean cpfExistente = validarCpf(imobiliaria, morador);

            if (cpfExistente) {
                System.out.println(" * CPF já registrado no sistema * ");
            } else {
                imovel.adicionarMorador(morador);
                int cadastrarNovoMorador = capturarDados("=== Cadastrar novo morador? ===\n 1- Sim \n 2- Não ").nextInt();
                if (cadastrarNovoMorador == 1) {
                    novosMoradores = true;
                }
            }
        }
    }

    public static Corretor cadastrarCorretor() {
        String nomeCorretor = capturarDados("Quem é o corretor?").nextLine();
        Corretor novoCorretor = new Corretor(nomeCorretor);
        return novoCorretor;
    }

    public static double aluguel() {
        double valorAluguel = capturarDados("Informe o valor do aluguel: ").nextDouble();
        return valorAluguel;
    }

    public static String endereco() {
        String novoEndereco = capturarDados("Informe o endereço: ").nextLine();
        return novoEndereco;
    }

    public static Imovel cadastrarImovel() {
        Imovel novoImovel = new Imovel();
        List<Morador> novosMoradores = new ArrayList<>();
        listaMoradores = novosMoradores;
        novoImovel.adicionarCorretor(cadastrarCorretor());
        novoImovel.escolherEndereco(endereco());
        novoImovel.valorDoAluguel(aluguel());
        novoImovel.setMoradores(cadastrarListaMoradores());
        return novoImovel;
    }

    public static void run() {
        boolean executar = true;

        while (executar) {

            menuInicial();

            int opcaoEscolhida = capturarDados("Digite sua opção: ").nextInt();
            switch (opcaoEscolhida) {

                case 1:
                    System.out.println(imobiliaria);
                    break;

                case 2:
                    imobiliaria.adicionarImovel(cadastrarImovel());
                    break;

                case 3:
                    System.out.println(" * Bye *");
                    executar = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
