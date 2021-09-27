package br.com.zup;

public class Morador {
    private String nome;
    private String cpf;
    private String ocupacao;
    private boolean animalDeEstimacao = true;

    //    Métodos construtores
    public Morador() {
    }

    public Morador(String nome, String cpf, String ocupacao, boolean animalDeEstimacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.ocupacao = ocupacao;
        this.animalDeEstimacao = animalDeEstimacao;
    }

    public Morador(String nome, String cpf, String ocupacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.ocupacao = ocupacao;
    }

    //    Getters e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public boolean isAnimalDeEstimacao() {
        return animalDeEstimacao;
    }

    public void setAnimalDeEstimacao(boolean animalDeEstimacao) {
        this.animalDeEstimacao = animalDeEstimacao;
    }
}
