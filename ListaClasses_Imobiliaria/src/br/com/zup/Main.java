package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Imovel casa1 = new Imovel("Rua das Araras, nº14", 750, "Anna");
        Morador morador1 = new Morador("Karol", "325.762.456-89", "Desenvolvedora");
        Morador morador2 = new Morador("Giovane", "456.457.098-23", "Desenvolvedor");

        Imovel casa2 = new Imovel("Rua dos Pardais, SN", 850, "Anna");
        Morador morador3 = new Morador("Bruno", "756.235.098-12", "Vendedor", false);

        //        Adicionando morador no imóvel
        casa1.adicionarMoradores(morador1);
        casa1.adicionarMoradores(morador2);
        casa2.adicionarMoradores(morador3);

        System.out.println(casa1);
        System.out.println(casa2);
    }
}
