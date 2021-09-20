package br.com.zup;

public class Pessoa {
    String nome;
    int idade;
    double altura, peso =0;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
