package Modules;

import DataClass.DadosExames;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Consulta implements Serializable {
    private Date dataDaConsulta;
    private String medicamentos, observacoes;
    private String receita;
    private String[] exames;
    //Associates
    private Pacientes paciente;
    private Funcionarios medico, outrosFuncionarios;

    public Consulta(Date dataDaConsulta, String medicamentos, String observacoes, String receita, Pacientes pacientes, Funcionarios medico, String[] exames, Funcionarios outrosFuncionarios) {
        setDataDaConsulta(dataDaConsulta);
        setObservacoes(medicamentos);
        setObservacoes(observacoes);
        setReceita(receita);
        setPaciente(pacientes);
        setMedico(medico);
        setExames(exames);
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

    public double realizarConsulta() {
        paciente.setDataUltimaConsulta(dataDaConsulta);
        ((OutrosFuncionarios) outrosFuncionarios).setnroConsultas(((OutrosFuncionarios) outrosFuncionarios).getNroConsultas() + 1);
        ((Medicos) medico).setNroConsultas(((Medicos) medico).getNroConsultas() + 1);

        double soma = 0;
        if (paciente instanceof PacienteSemPlanoDeSaude) {
            for (String exame : exames) {
                soma += Exames.valorSemPlano(DadosExames.buscar(exame));
                ((Medicos) medico).setSomaConsultasMes(((Medicos) medico).getSomaConsultasMes() + ((Medicos) medico).getValorConsulta());
            }
            //TODO testar isso
            ((PacienteSemPlanoDeSaude)paciente).setValorPagoNaUltimaConsulta(soma + ((Medicos) medico).getValorConsulta());
        } else {
            for (String exame : exames) {
                soma += Exames.valorComPlano(DadosExames.buscar(exame));
                ((Medicos) medico).setSomaConsultasMes(((Medicos) medico).getSomaConsultasMes() + ((Medicos) medico).getValorConsulta());
            }
        }

        return soma + ((Medicos) medico).getValorConsulta();
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }


    public String[] getExames() {
        return exames;
    }

    public boolean setExames(String[] exames) {
        this.exames = exames;
        return true;
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
        return "Consulta{" +
                "dataDaConsulta=" + dataDaConsulta +
                ", medicamentos='" + medicamentos + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", receita='" + receita + '\'' +
                ", exames=" + Arrays.toString(exames) +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", outrosFuncionarios=" + outrosFuncionarios +
                '}';
    }
}
