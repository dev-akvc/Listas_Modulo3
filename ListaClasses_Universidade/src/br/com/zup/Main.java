package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Professor prof = new Professor("Anna", "123.456.789.10", 12987, "Colégio XVI", 3000, "Superior", "Física", 15, 2);
        Coordenador coord = new Coordenador("Karol", "432.515.803-09", 13, "Colégio XVI", 7500, 1);

        coord.aumentarSalario();
        coord.adicionarProfessor(prof);





    }
}
