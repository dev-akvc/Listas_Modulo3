package br.com.zup.Exercicio3;

public class Elevador {
    int andarAtual;
    int totalDeAndares;
    int capacidadeLotacao;
    int totalPessoas;

    public Elevador() {
    }

    public Elevador(int andarAtual, int totalDeAndares, int capacidadeLotacao, int totalPessoas) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidadeLotacao = capacidadeLotacao;
        this.totalPessoas = totalPessoas;
    }

    //    Criando métodos
    public int entrarPessoas(int movimentacaoPessoas) {
        if (totalPessoas + movimentacaoPessoas <= capacidadeLotacao) {
            totalPessoas += movimentacaoPessoas;
        } else {
            System.out.println("Capacidade máxima já foi atingida.");
        }
        return totalPessoas;
    }

    public int sairPessoas(int movimentacaoPessoas) {
        if (totalPessoas - movimentacaoPessoas <= 0) {
            System.out.println("Elevador vazio.");
        }
        if (movimentacaoPessoas > totalPessoas) {
            System.out.println("Informe movimentação válida");
        } else {
            totalPessoas -= movimentacaoPessoas;
        }
        return totalPessoas;
    }

    public int subirElevador(int andarDesejado) {
        if (andarAtual >= 0 & andarAtual < totalDeAndares) {
            andarAtual = andarDesejado;
        } else {
            System.out.println("Não é possível subir.");
        }
        return andarAtual;
    }

    public int descerElevador(int andarDesejado) {
        if (andarAtual >= 0 & andarAtual < totalDeAndares) {
            andarAtual = andarDesejado;
        } else {
            System.out.println("Não é possível descer mais");
        }
        return andarAtual;
    }

    public void mostrarElevador() {
        System.out.println("O andar atual é " + andarAtual + " e tem " + totalPessoas + " pessoas.");
    }

}
