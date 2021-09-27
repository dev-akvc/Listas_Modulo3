package br.com.zup;

public class Turma {
    private int qtdAlunos;
    private String serie;

    //    Métodos construtores
    public Turma() {
    }

    public Turma(int qtdAlunos, String serie) {
        this.qtdAlunos = qtdAlunos;
        this.serie = serie;
    }

    //    Getters e setters
    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
