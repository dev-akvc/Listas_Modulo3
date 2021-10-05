package br.com.zup;

public class Morador extends Pessoa{
    private String ocupacao;
    private boolean animalDeEstimacao = true;

    //    Métodos construtores
    public Morador() {
    }

    public Morador(String ocupacao, boolean animalDeEstimacao) {
        this.ocupacao = ocupacao;
        this.animalDeEstimacao = animalDeEstimacao;
    }

    public Morador(String nome, String cpf, String ocupacao, boolean animalDeEstimacao) {
        super(nome, cpf);
        this.ocupacao = ocupacao;
        this.animalDeEstimacao = animalDeEstimacao;
    }
}
