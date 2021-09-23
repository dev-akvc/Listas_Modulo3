package br.com.zup.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa people = new Pessoa();

        people.setNome("Karol");
        people.setAltura(1.68);
        people.setDiaNascimento(23);
        people.setMesNascimento(3);
        people.setAnoNascimento(1994);
        people.idade(2021);
        people.exibirPessoa();

    }
}
