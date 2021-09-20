package br.com.zup;

import java.util.*;

public class Main {

    public static void main(String[] args) {
// 1 - Instanciando objetos da classe Bola
        Bola colorida = new Bola("rosa e preto", "flash", 2.3, 10);
        Bola futebol = new Bola("branca", "centauro", 3, 24.5);

        System.out.println("A cor da bola é " + colorida.cor + ", a marca " + colorida.marca + ", circunferência " + colorida.circunferencia + " e velocidade " + colorida.velocidade);

        System.out.print("A cor da bola é " + futebol.cor);
        System.out.print(", a marca " + futebol.marca);
        System.out.print(", circunferência " + futebol.circunferencia);
        System.out.println(" e velocidade " + futebol.velocidade);

        System.out.println("==========================================");

// 2 - Instanciando objetos da classe Pessoa
        Pessoa mulher = new Pessoa("Karol", 27, 1.7);
        Pessoa homem = new Pessoa("Giovane", 37, 1.7);
        homem.peso = 60;

        System.out.println("O nome é " + mulher.nome + ", a idade " + mulher.idade + " anos, e altura " + mulher.altura);
        System.out.println("O nome é " + homem.nome + ", a idade " + homem.idade + " anos, altura " + homem.altura + "m e peso " + homem.peso + "kg");

        System.out.println("==========================================");

// 3 - Instanciando objetos da classe Conta Corrente
        ContaCorrente comecoDeMes = new ContaCorrente("Karol Rica", "87432-7");
        comecoDeMes.saldo = 5000.43;
        ContaCorrente fimDeMes = new ContaCorrente("Karol Pobre", "87432-7");
        fimDeMes.saldo = -50.2;

        System.out.println("A cliente " + comecoDeMes.nome + " titular da conta " + comecoDeMes.numeroDaConta + " começa o mês com o saldo de R$" + comecoDeMes.saldo);
        System.out.println("Já no fim do mês o saldo é de R$" + fimDeMes.saldo);

        System.out.println("==========================================");

// 4 - Instanciando objetos da classe Carro
        Carro kwid = new Carro("Renault", "Kwid", "4");
        Carro veloster = new Carro("Hyundai", "Veloster", "3");
        veloster.potencia = 10.2;

        System.out.println(kwid.modelo + " é da marca " + kwid.marca);
        System.out.println("Veloster tem " + veloster.potencia + " de potência");

        System.out.println("==========================================");

// LEVEL UP - Instanciando objetos da classe País
        Scanner entrada = new Scanner(System.in);

//        Criando lista
        Map<String, String> continente = new HashMap<>();
        boolean opcaoEscolhida = true;

        Pais autralia = new Pais("Austrália", "extensão 7.713.364km²", "21.292.893 habitantes");
        Pais fiji = new Pais("Fiji", "extensão 18.270 km²", "889.953 habitantes");
        Pais novazelandia = new Pais("Nova Zelândia", "extensão 268.107 km²", "4.917.534 habitantes");
        Pais tonga = new Pais("Tonga", "extensão 748km²", "103.800 habitantes");

//         Adicionando os países à lista
        continente.put(autralia.nome, autralia.extensaoTerritorial + autralia.populacaoTotal);
        continente.put(fiji.nome, fiji.extensaoTerritorial + fiji.populacaoTotal);
        continente.put(novazelandia.nome, novazelandia.extensaoTerritorial + novazelandia.populacaoTotal);
        continente.put(tonga.nome, tonga.extensaoTerritorial + tonga.populacaoTotal);

        String menuInicial = "\nDigite:\n1- Exibir menu\n2- Sair do programa\n";
        System.out.println(menuInicial);
        int opcao = entrada.nextInt();

        while(opcaoEscolhida) {
        if(opcao == 1){
            System.out.println("Lista do continente Oceania\n"+continente.toString());
            System.out.println(menuInicial);
            opcao = entrada.nextInt();
        }
        if(opcao == 2){
            System.out.println("Programa encerrado.");
            opcaoEscolhida = false;
        }
        else {
            System.out.println("Opção inválida.");
            System.out.println(menuInicial);
            opcao = entrada.nextInt();
        }

        }
    }
}
