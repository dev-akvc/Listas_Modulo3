package br.com.zup.Exercicio2;

public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private int capacidadeLotacao;
    private int totalPessoas;

    public Elevador() {
    }

    public Elevador(int andarAtual, int totalDeAndares, int capacidadeLotacao, int totalPessoas) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidadeLotacao = capacidadeLotacao;
        this.totalPessoas = totalPessoas;
    }

//    public int getAndarAtual() {
//        return andarAtual;
//    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public int getCapacidadeLotacao() {
        return capacidadeLotacao;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public void setCapacidadeLotacao(int capacidadeLotacao) {
        this.capacidadeLotacao = capacidadeLotacao;
    }

    public void setTotalPessoas(int totalPessoas) {
        this.totalPessoas = totalPessoas;
    }

    public void mostrarElevador(){
        System.out.println("O andar atual é " +andarAtual+ " e tem " +totalPessoas+ " pessoas.");
    }
}
