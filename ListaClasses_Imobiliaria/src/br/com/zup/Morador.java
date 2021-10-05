package br.com.zup;

public class Morador extends Pessoa{
    private String ocupacao;

    //    Métodos construtores
    public Morador() {
    }

    public Morador(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Morador(String nome, String cpf, String ocupacao) {
        super(nome, cpf);
        this.ocupacao = ocupacao;
    }
}
