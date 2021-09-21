package br.com.zup.Exercicio3;

public class Elevador {
    int andarAtual, totalDeAndares = 10, capacidadeLotacao = 5, totalPessoas;

    //    Criando construtor
    public Elevador(int andarAtual, int totalPessoas) {
        this.andarAtual = andarAtual;
        this.totalPessoas = totalPessoas;
    }

    //    Criando métodos
    public void entrarPessoas(int movimentacaoPessoas) {
        if (totalPessoas + movimentacaoPessoas <= capacidadeLotacao) {
            totalPessoas += movimentacaoPessoas;
        } else {
            System.out.println("Capacidade máxima já foi atingida.");
        }
    }

    public void sairPessoas(int movimentacaoPessoas) {
        if (totalPessoas <= 1) {
            System.out.println("Elevador vazio.");
        } else {
            totalPessoas -= movimentacaoPessoas;
        }
    }

    public void subirElevador(int qtdAndares) {
        if (andarAtual < totalDeAndares) {
            andarAtual += qtdAndares;
        } else {
            System.out.println("Não é possível subir.");
        }
    }

    public void descerElevador(int qtdAndares) {
        if (andarAtual >0){
            andarAtual -= qtdAndares;
        } else {
            System.out.println("Não é possível descer mais");
        }
    }

    public void mostrarElevador() {
        System.out.println("O andar atual é " + andarAtual + " e tem " + totalPessoas + " pessoas.");
    }

}
