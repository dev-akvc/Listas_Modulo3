package br.com.zup;

public class Main {

    public static void main(String[] args) {
        boolean continuarExecutar = true;

        while (continuarExecutar) {
            try {
                Sistema.executar();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
}
