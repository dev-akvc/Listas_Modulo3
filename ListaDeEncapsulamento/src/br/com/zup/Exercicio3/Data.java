package br.com.zup.Exercicio3;

public class Data {
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public Data() {
    }

    public Data(int diaNascimento, int mesNascimento, int anoNascimento) {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }


    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
