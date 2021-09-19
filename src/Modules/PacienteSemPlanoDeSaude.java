package Modules;
import java.util.Date;

public class PacienteSemPlanoDeSaude extends Pacientes {
    private float descontoEspecial, valorPagoNaUltimaConsulta;

    public float getDescontoEspecial() {
        return descontoEspecial;
    }

    public boolean setDescontoEspecial(float descontoEspecial) {
        this.descontoEspecial = descontoEspecial;
        return true;
    }

    public float getValorPagoNaUltimaConsulta() {
        return valorPagoNaUltimaConsulta;
    }

    public boolean setValorPagoNaUltimaConsulta(float valorPagoNaUltimaConsulta) {
        this.valorPagoNaUltimaConsulta = valorPagoNaUltimaConsulta;
        return true;
    }

    public PacienteSemPlanoDeSaude(String nome, String cpf, String rg, String estadoCivil, Date dataUltimaConsulta,
            String sexo, Date dateNascimento, Date dataCadastro, float descontoEspecial,
            float valorPagoNaUltimaConsulta) {
        super(nome, cpf, rg, estadoCivil, dataUltimaConsulta, sexo, dateNascimento, dataCadastro);
        setDescontoEspecial(descontoEspecial);
        setValorPagoNaUltimaConsulta(valorPagoNaUltimaConsulta);
    }

    

}
