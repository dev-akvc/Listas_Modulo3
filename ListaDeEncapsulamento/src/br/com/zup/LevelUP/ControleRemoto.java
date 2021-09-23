package br.com.zup.LevelUP;

public class ControleRemoto {
    Televisao samsung = new Televisao();

    public ControleRemoto() {
    }

    public ControleRemoto(Televisao samsung) {
        this.samsung = samsung;
    }

    public void aumentarVolume(){
        int volume = samsung.getVolume();
        samsung.setVolume(volume+=1);
    }

    public void abaixarVolume(){
        int volume = samsung.getVolume();
        samsung.setVolume(volume-=1);
    }

    public void trocarCanal(int canalDesejado){
        samsung.setCanal(canalDesejado);
    }

    public void aumentarCanal(){
        int canal = samsung.getCanal();
        samsung.setCanal(canal +=1);
    }

    public void abaixarCanal(){
        int canal = samsung.getCanal();
        samsung.setCanal(canal -=1);
    }

    public void exibirTelevisao (){
        System.out.println("Canal atual é " +samsung.getCanal() +" e o volume é " +samsung.getVolume());
    }

}
