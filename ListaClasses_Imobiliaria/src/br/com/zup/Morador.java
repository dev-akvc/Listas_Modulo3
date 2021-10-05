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

    @Override
    public String toString() {
        StringBuilder exibirDados = new StringBuilder();

        exibirDados.append("\n Inquilino: " + getNome());
        exibirDados.append("\n CPF " + getCpf());

        return exibirDados.toString();
    }
}
