package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Karol", "karol@email");
        Fatura fatura = new Fatura(consumidor, 300, "07/10/2021");

        System.out.println(fatura);
    }
}
