package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
    private int qtdProfSupervisionados;
    private Professor[] professoresSupervisionados = new Professor[5];
    private int contador;

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

    public void adicionarProfessor(Professor professor) {
        this.professoresSupervisionados[contador] = professor;
        contador ++;
        this.qtdProfSupervisionados++;
    }
}
