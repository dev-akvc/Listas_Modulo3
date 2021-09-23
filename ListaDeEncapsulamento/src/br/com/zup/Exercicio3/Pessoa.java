package br.com.zup.Exercicio3;


import java.util.Scanner;

public class Pessoa {
    private String nome;
    private Data dataDeNascimento;
    int idade;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, Data dataDeNascimento, double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int idade(int mesAtual, int anoAtual) {
        if (dataDeNascimento.getMesNascimento() <= mesAtual) {
            idade = anoAtual - dataDeNascimento.getAnoNascimento();
        } else {
            idade = (anoAtual - 1) - dataDeNascimento.getAnoNascimento();
        }

        return idade;
    }

    public void exibirPessoa() {
        System.out.println(nome + " tem " + altura + "m, nasceu em " + dataDeNascimento.getDiaNascimento() + "/" + dataDeNascimento.getMesNascimento() + "/" + dataDeNascimento.getAnoNascimento() + " tendo então " + idade + " anos");
    }
}
