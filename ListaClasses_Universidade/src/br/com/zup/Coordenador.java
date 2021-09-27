package br.com.zup;

public class Coordenador extends Funcionario {
    private int qtdProfSupervisionados;

    //    Métodos construtores
    public Coordenador() {
    }

    public Coordenador(String nome, String cpf, double numeroDeRegistro, String orgaoLotacao, double salario, int qtdProfSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoLotacao, salario);
        this.qtdProfSupervisionados = qtdProfSupervisionados;
    }

    //    Getters e setters
    public int getQtdProfSupervisionados() {
        return qtdProfSupervisionados;
    }

    public void setQtdProfSupervisionados(int qtdProfSupervisionados) {
        this.qtdProfSupervisionados = qtdProfSupervisionados;
    }

    //    Método solicitado
    @Override
    public void aumentarSalario() {
        double salarioAumentado = (getSalario() * 1.05);
        setSalario(salarioAumentado);
    }

    public void adicionarProfessor(Professor professoresSupervisionados) {
        qtdProfSupervisionados += 1;
    }
}
