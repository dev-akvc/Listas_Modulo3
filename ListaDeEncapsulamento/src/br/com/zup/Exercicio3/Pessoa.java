package br.com.zup.Exercicio3;

import java.util.Date;
//import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int idade() {
        idade = 2021 - anoNascimento;
        return idade;
    }

    public void exibirPessoa() {

        System.out.println(nome + " tem " + altura + "m, nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + " tendo então " + idade + " anos");
    }
}
