package br.com.zup.Exercicio1;

public class Main {
    public static void main(String[] args) {
        //    Instanciando o carro
        Carro veloster = new Carro("Veloster", "Hyundai", "preto", 1000, 11111.11);

        //    Exibindo informações do carro
        veloster.mostrarCarro();

        //    Calculando desconto
        veloster.calcularDesconto(200);
        veloster.mostrarCarro();

        //    Pintando carro
        veloster.pintarCarro("rosa pink");
        veloster.mostrarCarro();
    }
}
