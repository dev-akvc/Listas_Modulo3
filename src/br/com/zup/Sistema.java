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
        System.out.println("\nDigite: \n 1- Cadastrar consumidor \n 2- Cadastrar fatura \n 3- Consultar faturas de um consumidor \n 4- Sair ");
    }

    public static Consumidor cadastrarConsumidor() throws Exception {
        String nome = leitorDados("Qual nome do consumidor? ").nextLine();
        String email = leitorDados("Qual email?").nextLine();
        return ServicoConsumidor.cadastrarConsumidor(nome, email);
    }

    public static Fatura cadastrarFatura() throws Exception {
        String email = leitorDados("Qual email do consumidor?").nextLine();
        double valorFatura = leitorDados("Informe valor da fatura: ").nextDouble();
        String dataDeVencimento = leitorDados("Informe a data de vecimento: ").nextLine();

        return ServicoFatura.cadastrarFatura(email, valorFatura, dataDeVencimento);
    }

    public static List<Fatura> pesquisarFaturas() {
        String email = leitorDados("Qual email do consumidor?").nextLine();
        List<Fatura> faturasDoConsumidor = ServicoFatura.pesquisarFaturaPorEmail(email);
        return faturasDoConsumidor;
    }

}
