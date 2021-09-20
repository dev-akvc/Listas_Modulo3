package br.com.zup.Exercicio1;

public class Carro {
    String nome, fabricante, cor;
    double peso, valor;

    //    Construtor
    public Carro(String nome, String fabricante, String cor, double peso, double valor) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.cor = cor;
        this.peso = peso;
        this.valor = valor;
    }

    // Método para calcular desconto
    public void calcularDesconto(double valorDesconto) {
        valor = valor - valorDesconto;
    }

    // Método para pintar
    public void pintarCarro(String novaCor) {
        cor = novaCor;
    }

    // Imprimir informações do carro
    public void mostrarCarro() {
        System.out.print("O carro " + nome +" " +cor + ", do fabricante " + fabricante);
        System.out.println(", pesa " +peso+ "kg e custa R$ " +valor);
    }
}
