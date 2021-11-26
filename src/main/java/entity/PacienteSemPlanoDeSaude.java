package entity;

import javax.persistence.Entity;
import java.util.Date;
@Entity
public class PacienteSemPlanoDeSaude extends Pacientes {
    private double descontoEspecial, valorPagoNaUltimaConsulta;

    public PacienteSemPlanoDeSaude() {

    }

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

    public PacienteSemPlanoDeSaude(String nome, String cpf, String rg, String estadoCivil, Endereco endereco,
                                   String sexo, Date dateNascimento, Date dataCadastro, double descontoEspecial) {
        super(nome, cpf, rg, estadoCivil,endereco, sexo, dateNascimento, dataCadastro);
        setDescontoEspecial(descontoEspecial);
    }



    @Override
    public String toString() {
        return super.toString()+"PacienteSemPlanoDeSaude{" +
                "descontoEspecial=" + descontoEspecial +
                ", valorPagoNaUltimaConsulta=" + valorPagoNaUltimaConsulta +
                '}';
    }
}
