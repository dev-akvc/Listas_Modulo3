package br.com.zup;

public class Administrador extends Colaborador{
    private double ajudaDeCusto;

    //    Métodos construtores
    public Administrador() {
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //    Getters e setters
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = (getSalarioBase() - getImposto()) +ajudaDeCusto;
        return salarioLiquido;
    }
}
