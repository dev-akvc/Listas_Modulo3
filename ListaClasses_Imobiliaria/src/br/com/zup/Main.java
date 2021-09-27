package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Imovel casa1 = new Imovel("Rua das Araras, nº14", 750, "Anna");
        Morador morador1 = new Morador("Karol", "325.762.456-89", "Desenvolvedora", true);
        Morador morador2 = new Morador("Giovane", "456.457.098-23", "Desenvolvedor", true);


        //        Adicionando morador no imóvel
        casa1.adicionarMoradores(morador1);
        casa1.adicionarMoradores(morador2);





    }
}
