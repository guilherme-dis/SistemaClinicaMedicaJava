import java.sql.Date;

import org.w3c.dom.Text;

public class Consulta {
    private Date dataDaConsulta;
    private String horarioDaConsulta, medicamentos, observacoes;
    private Text receita;
    private Pacientes paciente;
    private Medicos medico;
    private static int nroConsultas;
    private static int limiteConsultas;



    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public static int getNroConsultas() {
        return nroConsultas;
    }

    public static void setNroConsultas(int nroConsultas) {
        Consulta.nroConsultas = nroConsultas;
    }

    public static int getLimiteConsultas() {
        return limiteConsultas;
    }

    public static void setLimiteConsultas(int limiteConsultas) {
        Consulta.limiteConsultas = limiteConsultas;
    }

    public boolean resetConsultas(){
        this.nroConsultas=0;
        return true;
    }

    public Consulta(Pacientes paciente, Medicos medico) {
        this.paciente = paciente;
        this.medico = medico;
    }

    public Date getDataDaConsulta() {
        return dataDaConsulta;
    }

    public boolean setDataDaConsulta(Date dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
        return true;
    }

    public String getHorarioDaConsulta() {
        return horarioDaConsulta;
    }

    public boolean setHorarioDaConsulta(String horarioDaConsulta) {
        this.horarioDaConsulta = horarioDaConsulta;
        return true;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public boolean setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
        return true;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public boolean setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return true;
    }

    public Text getReceita() {
        return receita;
    }

    public boolean setReceita(Text receita) {
        this.receita = receita;
        return true;
    }

    public Consulta(Date dataDaConsulta, String horarioDaConsulta, String observacoes) {
        this.dataDaConsulta = dataDaConsulta;
        this.horarioDaConsulta = horarioDaConsulta;
        this.observacoes = observacoes;
    }

}
