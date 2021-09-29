package Modules;

import java.util.Date;

public class OutrosFuncionarios extends Funcionarios {
    private double salarioFixo;
    private double valorGratificacao;
    private String cargo;
    private int nroConsultas;
    private double valorlimConsulta;


    //3.f
    private static double valorASerPagoDeGratificacao;

    public static double getValorASerPagoDeGratificacao() {
        return valorASerPagoDeGratificacao;
    }

    public static boolean setValorASerPagoDeGratificacao(double valorASerPagoDeGratificacao) {
        OutrosFuncionarios.valorASerPagoDeGratificacao = valorASerPagoDeGratificacao;
        return true;
    }

    //3.i
    public double calcularSalario() {
        if (Consulta.getLimiteConsultas() <= Consulta.getNroConsultas()) {
            return salarioFixo + valorGratificacao;
        }
        return salarioFixo;
    }

    @Override
    public void loginClinica() {

    }

    @Override
    public void logoffClinica() {

    }

    @Override
    public String toString() {
        return super.toString()+"OutrosFuncionarios{" +
                "salarioFixo=" + salarioFixo +
                ", valorGratificacao=" + valorGratificacao +
                ", cargo='" + cargo + '\'' +
                ", nroConsultas=" + nroConsultas +
                ", valorlimConsulta=" + valorlimConsulta +
                '}';
    }

    // Valor de gratificacao
    public double getvalorGratificacao() {
        return valorGratificacao;
    }

    public OutrosFuncionarios(String nome, String cpf, String rg, String estadoCivil, String usuario, String senha,
                              String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, double salarioBase, double salarioFixo,
                              double valorGratificacao, String cargo, int nroConsultas, double valorlimConsulta) {
        super(nome, cpf, rg, estadoCivil, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase);
        setsalarioFixo(salarioFixo);
        setvalorGratificacao(valorGratificacao);
        setCargo(cargo);
        setnroConsultas(nroConsultas);
        setValorlim_consulta(valorlimConsulta);
    }

    public static OutrosFuncionarios cadastrar(String nome, String cpf, String rg, String estadoCivil, String usuario, String senha,
                                               String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, double salarioBase, double salarioFixo,
                                               double valorGratificacao, String cargo, int nroConsultas, double valorlimConsulta) {
        return new OutrosFuncionarios(nome, cpf, rg, estadoCivil, usuario, senha,
                numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase, salarioFixo,
                valorGratificacao, cargo, nroConsultas, valorlimConsulta);
    }

    public boolean setvalorGratificacao(double valorGratificacao) {
        if (valorGratificacao <= 0) {
            return false;
        } else {
            this.valorGratificacao = valorGratificacao;
            return true;
        }
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

    public boolean setValorlim_consulta(double valorlim_consulta) {
        if (valorlim_consulta <= 0)
            return false;
        else {
            this.valorlimConsulta = valorlim_consulta;
            return true;
        }

    }

    // Salario
    public double getsalarioFixo() {
        return salarioFixo;
    }

    public boolean setsalarioFixo(double salarioFixo) {
        if (salarioFixo <= 0)
            return false;
        else {
            this.salarioFixo = salarioFixo;
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

    public void confere_gratificacao() {
        if (nroConsultas > valorlimConsulta) {
            salarioFixo += valorGratificacao;
        }

    }

    public double getValorGratificacao() {
        return valorGratificacao;
    }

    public boolean setValorGratificacao(double valorGratificacao) {
        this.valorGratificacao = valorGratificacao;
        return true;
    }

    public boolean setNroConsultas(int nroConsultas) {
        this.nroConsultas = nroConsultas;
        return true;
    }
}
