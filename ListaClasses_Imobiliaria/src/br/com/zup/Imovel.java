package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    private List<Morador> moradores = new ArrayList<>();
    private Corretor corretor;

    //    Métodos construtores


    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, List<Morador> listaMoradores, Corretor corretor) {
    }

    public Imovel(String endereco, double valorAluguel) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
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

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void escolherEndereco (String novoEndereco){
        endereco = novoEndereco;
    }
    public void valorDoAluguel (double aluguel){
        valorAluguel = aluguel;
    }

    public void adicionarMorador (Morador novoMorador){
        moradores.add(novoMorador);
    }

    public void adicionarCorretor (Corretor novoCorretor){
        corretor = novoCorretor;
    }
    public void exibirMorador (){
        for (Morador referencia : moradores){
            System.out.println(referencia.getNome());
        }
    }

    //        Método para exibir os dados do imóvel
    @Override
    public String toString() {
        StringBuilder exibirDados = new StringBuilder();

        exibirDados.append("\n O imóvel do endereço: " + endereco);
        exibirDados.append("\n Tem o aluguel de R$ " + valorAluguel);
        exibirDados.append("\n E corretor " + corretor.getNome());
        exibirDados.append("\n Atualmente está locado para " + moradores.size() + " morador(es)");
        exibirDados.append("\n São eles: " + getMoradores().toString());
        exibirDados.append("\n");

        return exibirDados.toString();
    }

}
