package Modules;

public class Exames {
    private String nome;
    private double semPlano, comPlano;

    public Exames(String nome, double semPlano, double comPlano) {
        this.nome = nome;
        this.semPlano = semPlano;
        this.comPlano = comPlano;
    }

    public static Exames cadastrar(String nome, double semPlano, double comPlano) {
        return new Exames(nome, semPlano, comPlano);
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        this.nome = nome;
        return true;
    }

    public static double valorComPlano(Exames e) {
        return e.getComPlano();
    }

    public static double valorSemPlano(Exames e) {
        return e.getSemPlano();
    }

    public double getSemPlano() {
        return semPlano;
    }

    public boolean setSemPlano(double semPlano) {
        this.semPlano = semPlano;
        return true;
    }

    public double getComPlano() {
        return comPlano;
    }

    public boolean setComPlano(double comPlano) {
        this.comPlano = comPlano;
        return true;
    }

    @Override
    public String toString() {
        return "Exames{" +
                "nome='" + nome + '\'' +
                ", semPlano=" + semPlano +
                ", comPlano=" + comPlano +
                '}';
    }
}
