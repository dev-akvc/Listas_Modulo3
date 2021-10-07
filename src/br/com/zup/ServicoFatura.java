package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valorFatura, String dataDeVencimento) throws Exception {
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);

        Fatura fatura = new Fatura(consumidor, valorFatura, dataDeVencimento);
        faturas.add(fatura);
        return fatura;
    }

    public static List<Fatura> pesquisarFaturaPorEmail(String email) {
        List<Fatura> faturasDoConsumidor = new ArrayList<>();
        for (Fatura percorrerFaturas : faturas) {
            if (percorrerFaturas.getConsumidor().getEmail().equals(email)) {
                faturasDoConsumidor.add(percorrerFaturas);
            }
        }
        return faturasDoConsumidor;
    }
}
