package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    private String corretor;
    private List<Morador> moradores = new ArrayList<>();

    //    Métodos construtores
    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, String corretor) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.corretor = corretor;
    }

    //    Getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getCorretor() {
        return corretor;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }

    //    Método para adicionar moradores
    public void adicionarMoradores(Morador novoMorador) {
        moradores.add(novoMorador);
    }

    //        Método para exibir os dados do imóvel
    @Override
    public String toString() {
        StringBuilder exibirDados = new StringBuilder();

        exibirDados.append(" O imóvel do endereço: " + endereco);
        exibirDados.append("\n Tem o aluguel de R$ " + valorAluguel);
        exibirDados.append("\n E corretor " + corretor);
        exibirDados.append("\n Atualmente está locado para: " + moradores.size() + " morador(es)");
        exibirDados.append("\n São eles: " + moradores);

        return exibirDados.toString();
    }

}
