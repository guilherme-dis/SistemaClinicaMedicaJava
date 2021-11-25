package Modules;

import java.util.Date;

public class OutrosFuncionarios extends Funcionarios {
    private String cargo;
    private double salarioBase;

    // SALARIO BASE
    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        return true;
    }

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
    //5.c


    

    //CONSTRUTOR.
    public OutrosFuncionarios(String nome, String cpf, String rg, String estadoCivil, Endereco endereco, String usuario, String senha,
                              String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, double salarioBase, String cargo) {
        super(nome, cpf, rg, estadoCivil, endereco, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica);
        setCargo(cargo);
        setSalarioBase(salarioBase);
    }


    // Cargo
    public String getCargo() {
        return cargo;
    }

    public boolean setCargo(String cargo) {
        if (cargo.isEmpty()) {
            this.cargo = cargo;
            return true;
        } else
            return false;
    }


    @Override
    public String toString() {
        return super.toString() + "OutrosFuncionarios{" +
                "salario"+salarioBase+
                "cargo='" + cargo + '\'' +
                "Valor a ser pago de gratificação=" + valorASerPagoDeGratificacao +
                '}';
    }
}
