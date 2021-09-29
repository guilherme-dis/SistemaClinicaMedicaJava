package Modules;

import java.util.Date;

public class PacienteSemPlanoDeSaude extends Pacientes {
    //TODO procurar saber como funciona o instanceof
    private double descontoEspecial, valorPagoNaUltimaConsulta;

    public double getDescontoEspecial() {
        return descontoEspecial;
    }

    public boolean setDescontoEspecial(double descontoEspecial) {
        this.descontoEspecial = descontoEspecial;
        return true;
    }

    public double getValorPagoNaUltimaConsulta() {
        return valorPagoNaUltimaConsulta;
    }

    public boolean setValorPagoNaUltimaConsulta(double valorPagoNaUltimaConsulta) {
        this.valorPagoNaUltimaConsulta = valorPagoNaUltimaConsulta;
        return true;
    }

    public PacienteSemPlanoDeSaude(String nome, String cpf, String rg, String estadoCivil,
                                   String sexo, Date dateNascimento, Date dataCadastro, double descontoEspecial) {
        super(nome, cpf, rg, estadoCivil, sexo, dateNascimento, dataCadastro);
        setDescontoEspecial(descontoEspecial);
    }

    public static Pacientes cadastroPacienteSemPlanoDeSaude(String nome, String cpf, String rg, String estadoCivil,
                                                            String sexo, Date dateNascimento, Date dataCadastro, double descontoEspecial) {
        return new PacienteSemPlanoDeSaude(nome, cpf, rg, estadoCivil,
                sexo, dateNascimento, dataCadastro, descontoEspecial);
    }

    @Override
    public String toString() {
        return super.toString()+"PacienteSemPlanoDeSaude{" +
                "descontoEspecial=" + descontoEspecial +
                ", valorPagoNaUltimaConsulta=" + valorPagoNaUltimaConsulta +
                '}';
    }
}
