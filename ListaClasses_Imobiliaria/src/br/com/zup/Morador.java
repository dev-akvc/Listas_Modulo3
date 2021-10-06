package br.com.zup;

public class Morador extends Pessoa{
    private String email;

    //    Métodos construtores
    public Morador() {
    }

    public Morador(String email) {
        this.email = email;
    }

    public Morador(String nome, String cpf, String email) {
        super(nome, cpf);
        this.email = email;
    }

    public Morador(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder exibirDados = new StringBuilder();

        exibirDados.append("\n Inquilino: " + getNome());
        exibirDados.append("\n CPF " + getCpf());
        exibirDados.append("\n Email: " +email);

        return exibirDados.toString();
    }
}
