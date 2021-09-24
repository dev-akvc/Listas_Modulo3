package br.com.zup;

public class Inimigos {
    private String nome;
    private double vida;

    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //     Métodos solicitados
    public void trocarNome(String nome) {
        this.nome = nome;
    }

    public void receberDano(double dano) {
        this.vida -= dano;
    }

    public double exibirVida() {
        return vida;
    }

    //    Getter que falta
    public String getNome() {
        return nome;
    }
}
