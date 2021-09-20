package br.com.zup;

public class Main {

    public static void main(String[] args) {
// 1 - Instanciando objetos da classe Bola
        Bola colorida = new Bola("rosa e preto", "flash", 2.3, 10);
        Bola futebol = new Bola("branca", "centauro", 3, 24.5);

        System.out.println("A cor da bola é " +colorida.cor+ ", a marca " +colorida.marca+ ", circunferência " +colorida.circunferencia+ " e velocidade " +colorida.velocidade);

        System.out.print("A cor da bola é " +futebol.cor);
        System.out.print(", a marca " +futebol.marca);
        System.out.print(", circunferência " +futebol.circunferencia);
        System.out.println(" e velocidade " +futebol.velocidade);

        System.out.println("==========================================");

// 2 - Instanciando objetos da classe Pessoa
        Pessoa mulher = new Pessoa("Karol", 27, 1.7);
        Pessoa homem = new Pessoa("Giovane", 37, 1.7);
        homem.peso = 60;

        System.out.println("O nome é " +mulher.nome+ ", a idade " +mulher.idade+ " anos, e altura " +mulher.altura);
        System.out.println("O nome é " +homem.nome+ ", a idade " +homem.idade+ " anos, altura " +homem.altura+ "m e peso " +homem.peso+ "kg");

        System.out.println("==========================================");
    }
}
