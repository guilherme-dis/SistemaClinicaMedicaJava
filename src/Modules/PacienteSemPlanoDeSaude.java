package Modules;
import java.util.Date;

public class PacienteSemPlanoDeSaude extends Pacientes {
    private int tipo=1;//apenas para saber se é com ou sem plano
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

    public int getTipo() {
        return tipo;
    }

    public boolean setTipo(int tipo) {
        this.tipo = tipo;
        return true;
    }
}
