package Modules;

import java.io.Serializable;

public class Exames implements Serializable {
    private String nome;
    private double semPlano, comPlano;

    //CONSTRUTOR
    public Exames(String nome, double semPlano, double comPlano) {
        if (!setNome(nome)) {
            System.err.println("O nome do exame não pode ser vazio;");
            throw new IllegalArgumentException();
        } else if (!setSemPlano(semPlano)) {
            System.err.println("O Valor do exame sem o plano houve algum erro;");
            throw new IllegalArgumentException();
        } else if (!setComPlano(comPlano)) {
            System.err.println("O Valor do exame Com o plano houve algum erro;");
            throw new IllegalArgumentException();
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.isEmpty()) {
            return false;
        }
        this.nome = nome;
        return true;
    }


    public double getSemPlano() {
        return this.semPlano;
    }

    public boolean setSemPlano(double semPlano) {
        if (this.semPlano < 0)
            this.semPlano = 0;
        else
            this.semPlano = semPlano;
        return true;
    }

    public double getComPlano() {
        return this.comPlano;
    }

    public boolean setComPlano(double comPlano) {
        if (this.comPlano < 0)
            this.comPlano = 0;
        else
            this.comPlano = comPlano;
        return true;
    }
    //MÉTODOS

    public static double valorComPlano( Exames e) {
        return e.getComPlano();
    }

    public static double valorSemPlano( Exames e) {
        return e.getSemPlano();
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
