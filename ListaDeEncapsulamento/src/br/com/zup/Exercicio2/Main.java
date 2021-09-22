package br.com.zup.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Elevador thyssen = new Elevador();

        thyssen.mostrarElevador();
        thyssen.setTotalDeAndares(10);
        thyssen.setAndarAtual(9);
        thyssen.setCapacidadeLotacao(8);
        thyssen.setTotalPessoas(5);

        thyssen.mostrarElevador();

        thyssen.setTotalPessoas(3);
        thyssen.setAndarAtual(0);

        thyssen.mostrarElevador();


    }
}
