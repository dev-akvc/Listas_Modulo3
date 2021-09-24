package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Voadores voador = new Voadores("Falcão", 1000, 10);
        Guerreiros guerreiro = new Guerreiros("Batman", 1500, 25);

        double danoVoador = voador.aplicarDano();
        double danoGuerreiro = guerreiro.aplicarDano();

        // Início do jogo
        System.out.println(guerreiro.getNome() + " tem " + guerreiro.exibirVida() + " vidas");
        System.out.println(voador.getNome() + " tem " + voador.exibirVida() + " vidas");

        // Luta
        voador.receberDano(danoGuerreiro);
        voador.receberDano(danoGuerreiro);
        voador.receberDano(danoGuerreiro);
        voador.receberDano(danoGuerreiro);
        guerreiro.receberDano(danoVoador);
        guerreiro.receberDano(danoVoador);
        guerreiro.receberDano(danoVoador);

        System.out.println(guerreiro.getNome() + " tem " + guerreiro.exibirVida() + " vidas");
        System.out.println(voador.getNome() + " tem " + voador.exibirVida() + " vidas");

        guerreiro.trocarNome("Mulher Maravilha");
        System.out.println(guerreiro.getNome() + " tem " + guerreiro.exibirVida() + " vidas");

        voador.receberDano(danoGuerreiro);
        System.out.println(voador.getNome() + " tem " + voador.exibirVida() + " vidas");
    }
}
