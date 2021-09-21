package br.com.zup.Exercicio3;

public class Main {
    public static void main(String[] args) {
        //        Instanciando o elevador
        Elevador thyssen = new Elevador(0, 3);

        //        Exibindo estado do elevador
        thyssen.mostrarElevador();

        //        Entrando pessoas
        thyssen.entrarPessoas(1);
        thyssen.mostrarElevador();

        //        Subindo andar
        thyssen.subirElevador(4);
        thyssen.mostrarElevador();

        //        Saindo pessoas
        thyssen.sairPessoas(3);
        thyssen.mostrarElevador();

        //        Descendo andar
        thyssen.descerElevador(2);
        thyssen.mostrarElevador();

        thyssen.descerElevador(2);
        thyssen.mostrarElevador();

    }
}
