package Modules;

import java.io.Serializable;
import java.util.Date;

public class OutrosFuncionarios extends Funcionarios  {
    private String cargo;


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


    @Override
    public void resetaInfo() {
        Consulta.setNroConsultas(0);
    }

    //CONSTRUTOR.
    public OutrosFuncionarios(String nome, String cpf, String rg, String estadoCivil, Endereco endereco, String usuario, String senha,
                              String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, double salarioBase, String cargo) {
        super(nome, cpf, rg, estadoCivil, endereco, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase);
        setCargo(cargo);
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
        return super.toString()+"OutrosFuncionarios{" +
                "cargo='" + cargo + '\'' +
                "Valor a ser pago de gratificação=" + valorASerPagoDeGratificacao +
                '}';
    }
}
