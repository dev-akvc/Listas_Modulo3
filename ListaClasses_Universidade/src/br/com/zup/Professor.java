package br.com.zup;

public class Professor extends Funcionario {
    private String nivelGraduacao;
    private String disciplina;
    private int qtdAlunos;
    private int qtdTurmas;

    //    Métodos construtores

    public Professor() {
    }

    public Professor(String nome, String cpf, double numeroDeRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplina, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    //    Getters e setters

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    //    Método solicitado
    public void adicionarTurma() {
        qtdTurmas += 1;
    }

}
