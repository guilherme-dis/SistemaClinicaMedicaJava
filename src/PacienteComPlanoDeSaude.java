import java.sql.Date;

public class PacienteComPlanoDeSaude extends Pacientes {
    private String planoDeSaude;
    private String numeroCarteirinha, periodoDeCarencia;
    private Date dataIngreco;

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    public boolean setPlanoDeSaude(String planoDeSaude) {
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

    public Date getDataIngreco() {
        return dataIngreco;
    }

    public boolean setDataIngreco(Date dataIngreco) {
        this.dataIngreco = dataIngreco;
        return true;
    }

    

    public PacienteComPlanoDeSaude(String nome, String cpf, byte estadoCivil, String sexo, Date dateNascimento,
            Date dataCadastro, String planoDeSaude, String numeroCarteirinha, String periodoDeCarencia,
            Date dataIngreco) {
        super(nome, cpf, estadoCivil, sexo, dateNascimento, dataCadastro);
        this.planoDeSaude = planoDeSaude;
        this.numeroCarteirinha = numeroCarteirinha;
        this.periodoDeCarencia = periodoDeCarencia;
        this.dataIngreco = dataIngreco;
    }

}
