package Modules;

import java.util.Date;

public class OutrosFuncionarios extends Funcionarios {
    private String cargo;
    private int nroConsultas;
    private double valorlimConsulta;


    //3.f
    private static double valorASerPagoDeGratificacao;

    public static double getValorASerPagoDeGratificacao() {
        return valorASerPagoDeGratificacao;
    }

    public static boolean setValorASerPagoDeGratificacao(double valorASerPagoDeGratificacao) {
        if (valorASerPagoDeGratificacao < 0)
            OutrosFuncionarios.valorASerPagoDeGratificacao = 0;
        else
            OutrosFuncionarios.valorASerPagoDeGratificacao = valorASerPagoDeGratificacao;
        return true;
    }

    //3.i
    public double calcularSalario() {
        if (Consulta.getLimiteConsultas() <= Consulta.getNroConsultas()) {
            return getSalarioBase() + getValorASerPagoDeGratificacao();
        }
        return getSalarioBase();
    }


    public OutrosFuncionarios(String nome, String cpf, String rg, String estadoCivil, Endereco endereco, String usuario, String senha,
                              String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, double salarioBase,
                              double valorGratificacao, String cargo, double valorlimConsulta) {
        super(nome, cpf, rg, estadoCivil, endereco, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase);
        setValorASerPagoDeGratificacao(valorGratificacao);
        setCargo(cargo);
        setnroConsultas(nroConsultas = 0);
        setValorlimConsulta(valorlimConsulta);
    }


    // Numeros de consultas realizadas
    public int getNroConsultas() {
        return nroConsultas;
    }

    public boolean setnroConsultas(int nroConsultas) {
        if (nroConsultas < 0)
            return false;
        else {
            this.nroConsultas = nroConsultas;
            return true;
        }
    }

    // Valor limite para cada consulta
    public double getValorlimConsulta() {
        return valorlimConsulta;
    }

    public boolean setValorlimConsulta(double valorlim_consulta) {
        if (valorlim_consulta <= 0)
            return false;
        else {
            this.valorlimConsulta = valorlim_consulta;
            return true;
        }

    }


    // Cargo
    public String getCargo() {
        return cargo;
    }

    public boolean setCargo(String cargo) {
        if (cargo.length() > 0) {
            this.cargo = cargo;
            return true;
        } else
            return false;
    }

    public void confereGratificacao() {
        if (nroConsultas > valorlimConsulta) {
            setSalarioBase(getSalarioBase() + getValorASerPagoDeGratificacao());
        }

    }


    public boolean setNroConsultas(int nroConsultas) {
        this.nroConsultas = nroConsultas;
        return true;
    }

    @Override
    public void loginClinica() {

    }

    @Override
    public void logoffClinica() {

    }
    @Override
    public String toString() {
        return super.toString() + "OutrosFuncionarios{" +
                ", valorGratificacao=" + getValorASerPagoDeGratificacao() +
                ", cargo='" + cargo + '\'' +
                ", nroConsultas=" + nroConsultas +
                ", valorlimConsulta=" + valorlimConsulta +
                '}';
    }
}
