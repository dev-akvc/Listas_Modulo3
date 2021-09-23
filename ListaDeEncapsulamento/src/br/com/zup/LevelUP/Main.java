package br.com.zup.LevelUP;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controll = new ControleRemoto();

        controll.exibirTelevisao();

        controll.trocarCanal(12);
        controll.aumentarVolume();
        controll.aumentarVolume();
        controll.aumentarVolume();
        controll.exibirTelevisao();
        controll.aumentarCanal();
        controll.abaixarVolume();
        controll.exibirTelevisao();
        controll.abaixarCanal();
        controll.exibirTelevisao();



    }
}
