package Modules;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Consulta implements Serializable {

    private boolean done;
    private Date dataDaConsulta;
    private String medicamentos, observacoes;
    private String receita;
    private Exames[] exames;
    //Associates
    private Pacientes paciente;
    private Funcionarios medico, outrosFuncionarios;

    public Consulta(Date dataDaConsulta, String receita, Pacientes pacientes, Funcionarios medico, Funcionarios outrosFuncionarios, Exames[] exames) {
        setDataDaConsulta(dataDaConsulta);
        setReceita(receita);
        setPaciente(pacientes);
        setMedico(medico);
        setOutrosFuncionarios(outrosFuncionarios);
        setExames(exames);
        setDone(false);
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    //2.c
    public Consulta(Pacientes paciente, Medicos medico) {
        setPaciente(paciente);
        setMedico(medico);
    }

    //3.d
    private static int nroConsultas = 0;

    public static int getNroConsultas() {
        return nroConsultas;

    }

    public static void setNroConsultas(int nroConsultas) {
        Consulta.nroConsultas = nroConsultas;
    }

    public static void resetConsultas() {
        setNroConsultas(0);
    }

    //3.e
    private static int limiteConsultas = 0;

    public static int getLimiteConsultas() {
        return limiteConsultas;
    }

    public static void setLimiteConsultas(int limiteConsultas) {
        Consulta.limiteConsultas = limiteConsultas;
    }

    //4
    //TODO medico cobrar de gratis se o plano do paciente for o que ele atende
    public double realizarConsulta(String medicamentos, String observacoes) {

        setMedicamentos(medicamentos);
        setObservacoes(observacoes);
        paciente.setDataUltimaConsulta(dataDaConsulta);
        nroConsultas++;
        double soma = 0;
        if (paciente instanceof PacienteSemPlanoDeSaude) {
            for (Exames exame : exames) {
                if (exame != null) {
                    soma += exame.getSemPlano();
                }
            }
            ((PacienteSemPlanoDeSaude) paciente).setValorPagoNaUltimaConsulta(soma + ((Medicos) medico).getValorConsulta());
        } else {
            for (Exames exame : exames) {
                if (exame != null) {
                    soma += exame.getComPlano();
                }
            }
            for (PlanoDeSaude plano : ((Medicos) medico).getPlanoDeSaude()) {
                if (Objects.equals(plano, ((PacienteComPlanoDeSaude) paciente).getPlanoDeSaude())) {
                    paciente.setDataUltimaConsulta(new Date());
                    return soma;
                }
            }
        }
        ((Medicos) medico).setNroConsultas(((Medicos) medico).getNroConsultas() + 1);
        this.done = true;
        return soma + ((Medicos) medico).getValorConsulta();
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Exames[] getExames() {
        return exames;
    }

    public boolean setExames(Exames[] exames) {
        this.exames = exames;
        return true;
    }

    public Date getDataDaConsulta() {
        return dataDaConsulta;
    }

    public boolean setDataDaConsulta(Date dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
        return true;
    }

    public Funcionarios getMedico() {
        return medico;
    }

    public boolean setMedico(Funcionarios medico) {
        this.medico = medico;
        return true;
    }

    public Funcionarios getOutrosFuncionarios() {
        return outrosFuncionarios;
    }

    public boolean setOutrosFuncionarios(Funcionarios outrosFuncionarios) {
        this.outrosFuncionarios = outrosFuncionarios;
        return true;
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

    @Override
    public String toString() {
        return "Consulta{"
                + "Done" + done
                + ", dataDaConsulta=" + dataDaConsulta
                + ", medicamentos='" + medicamentos + '\''
                + ", observacoes='" + observacoes + '\''
                + ", receita='" + receita + '\''
                + ", exames=" + Arrays.toString(exames)
                + ", paciente=" + paciente
                + ", medico=" + medico
                + ", outrosFuncionarios=" + outrosFuncionarios
                + '}';
    }
}
