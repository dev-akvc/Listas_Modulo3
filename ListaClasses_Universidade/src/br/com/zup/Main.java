package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Professor prof = new Professor("Anna", "123.456.789.10", 12987, "Colégio XVI", 3000, "Superior", "Física", 15, 7);
        Coordenador coord = new Coordenador("Karol", "432.515.803-09", 13, "Colégio XVI", 7500, 1);

        //      teste de adicionar professores à classe coordenador
        coord.aumentarSalario();
        System.out.println(coord.getSalario());
        System.out.println("O coordenador(a) " +coord.getNome() + " supervisiona " +coord.getQtdProfSupervisionados() + " professores(as).");
        coord.adicionarProfessor(prof);
        System.out.println("O coordenador(a) " +coord.getNome() + " supervisiona " +coord.getQtdProfSupervisionados() + " professores(as).");

        //      teste de adicionar turmas ao professor
        Turma turma1 = new Turma(20, "5ª série A");
        Turma turma2 = new Turma(20, "5ª série B");
        prof.registrarTurma(turma1);
        prof.exibirDados();
        prof.registrarTurma(turma2);
        prof.exibirDados();
    }
}
