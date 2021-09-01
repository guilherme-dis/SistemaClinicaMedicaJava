import java.sql.Date;

import org.w3c.dom.Text;

public class Consulta {
    private Date dataDaConsulta;
    private String horarioDaConsulta, medicamentos, observacoes;
    private Text receita;

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
