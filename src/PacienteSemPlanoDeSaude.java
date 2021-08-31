import java.sql.Date;

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

    public PacienteSemPlanoDeSaude(String nome, String cpf, byte estadoCivil, String sexo, Date dateNascimento,
            Date dataCadastro, float descontoEspecial, float valorPagoNaUltimaConsulta) {
        super(nome, cpf, estadoCivil, sexo, dateNascimento, dataCadastro);
        this.descontoEspecial = descontoEspecial;
        this.valorPagoNaUltimaConsulta = valorPagoNaUltimaConsulta;
    }

}
