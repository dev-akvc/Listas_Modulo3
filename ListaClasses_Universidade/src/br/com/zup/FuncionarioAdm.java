package br.com.zup;

public class FuncionarioAdm extends Funcionario{
    private String funcaoAdministrativa;
    private String senioridade;

    //    Métodos construtores
    public FuncionarioAdm() {
    }

    public FuncionarioAdm(String nome, String cpf, double numeroDeRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    //    Getters e setters
    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
