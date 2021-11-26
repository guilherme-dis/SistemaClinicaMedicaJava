package entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
@Entity
public class PacienteComPlanoDeSaude extends Pacientes {
    @ManyToOne
    private PlanoDeSaude planoDeSaude;
    private String numeroCarteirinha, periodoDeCarencia;
    @Temporal(TemporalType.DATE)
    private Date dataIngrecoNoPlano;

    public PacienteComPlanoDeSaude() {
        super();
    }


    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public boolean setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
        return true;
    }

    public String getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

    public boolean setNumeroCarteirinha(String numeroCarteirinha) {
        this.numeroCarteirinha = numeroCarteirinha;
        return true;
    }

    public String getPeriodoDeCarencia() {
        return periodoDeCarencia;
    }

    public boolean setPeriodoDeCarencia(String periodoDeCarencia) {
        this.periodoDeCarencia = periodoDeCarencia;
        return true;
    }

    public Date getDataIngrecoNoPlano() {
        return dataIngrecoNoPlano;
    }

    public boolean setDataIngreco(Date dataIngreco) {
        this.dataIngrecoNoPlano = dataIngreco;
        return true;
    }

    public PacienteComPlanoDeSaude(String nome, String cpf, String rg, String estadoCivil, Endereco endereco,
                                   String sexo, Date dateNascimento, Date dataCadastro, PlanoDeSaude planoDeSaude, String numeroCarteirinha,
                                   String periodoDeCarencia, Date dataIngrecoNoPlano) {
        super(nome, cpf, rg, estadoCivil,endereco, sexo, dateNascimento, dataCadastro);
        setPlanoDeSaude(planoDeSaude);
        setNumeroCarteirinha(numeroCarteirinha);
        setPeriodoDeCarencia(periodoDeCarencia);
        setDataIngreco(dataIngrecoNoPlano);
    }



    @Override
    public String toString() {
        return super.toString()+"PacienteComPlanoDeSaude{" +
                "planoDeSaude=" + planoDeSaude +
                ", numeroCarteirinha='" + numeroCarteirinha + '\'' +
                ", periodoDeCarencia='" + periodoDeCarencia + '\'' +
                ", dataIngrecoNoPlano=" + dataIngrecoNoPlano +
                '}';
    }
}
