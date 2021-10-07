package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static Scanner leitorDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println(" * Gerenciamento de consumidores * ");
        System.out.println("\n== Menu == \n 1- Cadastrar consumidor \n 2- Cadastrar fatura \n 3- Consultar faturas de um consumidor \n 4- Sair ");
    }

    public static Consumidor cadastrarConsumidor() throws Exception {
        String nome = leitorDados("Qual nome do consumidor? ").nextLine();
        String email = leitorDados("Qual email?").nextLine();
        return ServicoConsumidor.cadastrarConsumidor(nome, email);
    }

    public static Fatura cadastrarFatura() throws Exception {
        String email = leitorDados("Qual email do consumidor?").nextLine();
        double valorFatura = leitorDados("Informe valor da fatura: ").nextDouble();
        String dataDeVencimento = leitorDados("Informe a data de vencimento: ").nextLine();
        return ServicoFatura.cadastrarFatura(email, valorFatura, dataDeVencimento);
    }

    public static List<Fatura> pesquisarFaturas() throws Exception {
        String email = leitorDados("Qual email do consumidor?").nextLine();
        ServicoConsumidor.validarEmail(email);
        List<Fatura> faturasDoConsumidor = ServicoFatura.pesquisarFaturaPorEmail(email);
        System.out.println("Tem " + faturasDoConsumidor.size() + " fatura(s)");
        return faturasDoConsumidor;
    }

    public static boolean executar() throws Exception {
        boolean continuarMenu = true;

        while (continuarMenu) {
            menu();

            int opcaoEscolhida = leitorDados("Digite sua opção").nextInt();

            if (opcaoEscolhida == 1) {
                Consumidor consumidor = cadastrarConsumidor();
                System.out.println(consumidor);
            } else if (opcaoEscolhida == 2) {
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            } else if (opcaoEscolhida == 3) {
                List<Fatura> faturas = pesquisarFaturas();
                System.out.println(faturas);
            } else if (opcaoEscolhida == 4) {
                System.out.println("* Bye *");
                continuarMenu = false;
            }
        }
        return continuarMenu;
    }

}
