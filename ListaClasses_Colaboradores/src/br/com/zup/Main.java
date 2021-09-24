package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Giovane", "Av Paralela, nº27", "(53)99345-6783", 5000, 1000);
        Colaborador colaborador = new Colaborador("Bruno", "Rua das Bandeira, S/N", "(13)93246-9321", 1, 7000, 100);
        Administrador administrador = new Administrador("Fábio", "Travessa Rio Negro, nº89", "(73)92147-2132", 2, 4000, 150, 500);

        //        Teste saldo do fornecedor
        System.out.println("O saldo é R$ " + fornecedor.obterSaldo());
        fornecedor.setValorCredito(6000);
        System.out.println("O saldo é R$ " + fornecedor.obterSaldo());

        //        Teste endereço do fornecedor
        System.out.println("O endereço de " + fornecedor.getNome() + " é " + fornecedor.getEndereco());

        //        Teste colaborador
        System.out.println("O salário de " + colaborador.getNome() + " é R$ " + colaborador.calcularSalario());

        //        Teste administrador
        System.out.println("O salário de " + administrador.getNome() + " é R$ " + administrador.calcularSalario());
        administrador.setAjudaDeCusto(1000);
        System.out.println("O salário de " + administrador.getNome() +", do setor " +administrador.getCodigoSetor() + ", é R$ " + administrador.calcularSalario());

    }
}
