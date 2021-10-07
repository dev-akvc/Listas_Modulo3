package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static Consumidor cadastrarConsumidor(String nome, String email){
        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor);
        return consumidor;
    }

    public static void exibirConsumidores(){
        for (Consumidor buscarConsumidor: consumidores) {
            System.out.println(buscarConsumidor);
        }
    }

    public static Consumidor pesquisarConsumidorPorEmail (String email) throws Exception{
        for (Consumidor pesquisarConsumidor: consumidores) {
            if(pesquisarConsumidor.getEmail().equals(email)){
                return pesquisarConsumidor;
            }
        }
        throw new Exception("* Consumidor não cadastrado *");
    }

}
