package Modules;

import java.util.Date;

public class Consulta {
    private Date dataDaConsulta;
    private String medicamentos, observacoes;
    private String receita;

    //Associates
    private Pacientes paciente;
    private Medicos medico;
    private Exames exames;
    private String[] exameslist;
    private OutrosFuncionarios outrosFuncionarios;


    public Consulta(Date dataDaConsulta, String medicamentos, String observacoes, String receita, Pacientes pacientes, Medicos medico, Exames exames,String[] exameslist, OutrosFuncionarios outrosFuncionarios) {
        setDataDaConsulta(dataDaConsulta);
        setObservacoes(medicamentos);
        setObservacoes(observacoes);
        setReceita(receita);
        setPaciente(pacientes);
        setMedico(medico);
        setExames(exames);
        this.exameslist=exameslist;
        setOutrosFuncionarios(outrosFuncionarios);
    }



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

    /*public double realizarConsulta() {
        paciente.setDataUltimaConsulta(dataDaConsulta);
        outrosFuncionarios.setnroConsultas(getNroConsultas() + 1);
        medico.setNroConsultas(getNroConsultas() + 1);

        double soma=0;
        if(paciente instanceof PacienteSemPlanoDeSaude){
            for (int i = 0; i < exameslist.length-1; i++) {
                soma+=exames.getExameSemPlano(exameslist[i]);
                medico.setSomaConsultasMes(medico.getSomaConsultasMes()+medico.getValorConsulta());
            }
        }else{
            for (int i = 0; i < exameslist.length-1; i++) {
                soma+=exames.getExameComPlano(exameslist[i]);
                medico.setSomaConsultasMes(medico.getSomaConsultasMes()+(medico.getValorConsulta()*0.20));
            }
        }
        return soma+medico.getValorConsulta();
    }*/

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



    public Exames getExames() {
        return exames;
    }

    public boolean setExames(Exames exames) {
        this.exames = exames;
        return true;
    }

    public OutrosFuncionarios getOutrosFuncionarios() {
        return outrosFuncionarios;
    }

    public boolean setOutrosFuncionarios(OutrosFuncionarios outrosFuncionarios) {
        this.outrosFuncionarios = outrosFuncionarios;
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

    public String getReceita() {
        return receita;
    }

    public boolean setReceita(String receita) {
        this.receita = receita;
        return true;
    }


}
