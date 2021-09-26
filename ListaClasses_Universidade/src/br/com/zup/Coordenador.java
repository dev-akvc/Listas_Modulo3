package br.com.zup;

public class Coordenador extends Funcionario {
    private int ProfessoresSupervisionados;

    //    Métodos construtores
    public Coordenador() {
    }

    public Coordenador(String nome, String cpf, double numeroDeRegistro, String orgaoLotacao, double salario, int professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoLotacao, salario);
        ProfessoresSupervisionados = professoresSupervisionados;
    }

    //    Getters e setters
    public int getProfessoresSupervisionados() {
        return ProfessoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        ProfessoresSupervisionados = professoresSupervisionados;
    }

    //    Método solicitado
    @Override
    public void aumentarSalario() {
        double salarioAumentado = (getSalario() * 1.05);
        setSalario(salarioAumentado);
    }

    public void adicionarProfessor() {
        ProfessoresSupervisionados += 1;
    }
}
