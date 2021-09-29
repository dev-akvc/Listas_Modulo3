package br.com.zup;

public class TabelaNutricional {
    private double valorEnergetico;
    private double proteinas;
    private double carboidratos;
    private double fibraAlimentar;

    //  Métodos contrutores
    public TabelaNutricional() {
    }

    public TabelaNutricional(double valorEnergetico, double proteinas, double carboidratos, double fibraAlimentar) {
        this.valorEnergetico = valorEnergetico;
        this.proteinas = proteinas;
        this.carboidratos = carboidratos;
        this.fibraAlimentar = fibraAlimentar;
    }

    //  Métodos getters e setters
    public double getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(double valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(double fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    @Override
    public String toString (){
        StringBuilder exibirTabela = new StringBuilder();

        exibirTabela.append(" === Tabela Nutricional ===");
        exibirTabela.append("\n Tem de calorias: " +valorEnergetico);
        exibirTabela.append("\n Proteínas: " +proteinas);
        exibirTabela.append("\n Carboidratos: " +carboidratos);
        exibirTabela.append("\n Fibra alimentar: " +fibraAlimentar + "\n");

        return  exibirTabela.toString();
    }
}
