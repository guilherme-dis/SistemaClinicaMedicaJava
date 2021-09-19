package Modules;

import org.w3c.dom.Text;

import java.util.Date;
//TODO perguntar para a professora como que eu mando o dinheiro para o médico, por exemplo.
// Quando eu realizo uma consulta, como eu sei quanto de dinheiro que essa consulta vale. e se o metodo realizar consulta, chama o metodo calcular salário do médico
public class Consulta {
    private Date dataDaConsulta;
    private String horarioDaConsulta, medicamentos, observacoes;
    private Text receita;

    //Associates
    private Pacientes paciente;
    private Medicos medico;
    private Exames[] exames;
    private OutrosFuncionarios outrosFuncionarios;

    //2.c
    public Consulta(Pacientes paciente, Medicos medico) {
        this.paciente = paciente;
        this.medico = medico;
    }

    //3.d
    private static int nroConsultas;

    public boolean resetConsultas() {
        nroConsultas = 0;
        return true;
    }

    //3.e
    private static int limiteConsultas;

    //4
    public void realizarConsulta(String horarioDaConsulta,String medicamentos,String observacoes,Text receita ){
        dataDaConsulta=new Date();
        this.horarioDaConsulta=horarioDaConsulta;
        this.medicamentos=medicamentos;
        this.observacoes=observacoes;
        this.receita=receita;
        paciente.setDataUltimaConsulta(dataDaConsulta);
        medico.setNro_consultas(getNroConsultas()+1);
        outrosFuncionarios.setNroConsultas(getNroConsultas()+1);
    }

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
