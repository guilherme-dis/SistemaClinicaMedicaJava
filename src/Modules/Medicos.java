package Modules;


import java.util.Arrays;
import java.util.Date;


public class Medicos extends Funcionarios {
    private String CRM;
    private String[] especialidadesAtendidas;
    private double valorConsulta, somaConsultasMes, bonus;
    private int nroConsultas=0, valorlimConsulta;
    private PlanoDeSaude[] planoDeSaude;

    //2.a
    public Medicos(String cpf, PlanoDeSaude[] planoDeSaude) {
        super(cpf);
        if (!setPlanoDeSaude(planoDeSaude)) {
            throw new IllegalArgumentException("Erro ao inserir plano de saude");
        }
        ;
    }

    //2.b
    public Medicos() {
    }

    //3.h

    public double calcularSalario() {
        if (valorlimConsulta <= nroConsultas) {
            somaConsultasMes += bonus;
        }
        return somaConsultasMes;
    }

    @Override
    public void loginClinica() {

    }

    @Override
    public void logoffClinica() {

    }


    public boolean resetSomaConsultaMes() {
        this.somaConsultasMes = 0;
        return true;
    }

    public PlanoDeSaude[] getPlanoDeSaude() {
        return planoDeSaude;
    }

    public boolean setPlanoDeSaude(PlanoDeSaude[] planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
        return true;
    }

    //Valor de cada consultaa
    public double getValorConsulta() {
        return valorConsulta;
    }

    public boolean setValorConsulta(double valor_consulta) {
        if (valor_consulta <= 0)
            return false;
        else {
            this.valorConsulta = valor_consulta;
            return true;
        }
    }

    public double getSomaConsultasMes() {
        return somaConsultasMes;
    }

    public boolean setSomaConsultasMes(double somaConsultasMes) {
        this.somaConsultasMes = somaConsultasMes;
        return true;
    }

    // Numero de Consultas
    public int getNroConsultas() {
        return nroConsultas;
    }

    public boolean setNroConsultas(int nroConsultas) {
        if (nroConsultas < 0)
            return false;
        else {
            this.nroConsultas += nroConsultas;
            return true;
        }
    }

    // CRM
    public String getCRM() {
        return CRM;
    }

    public boolean setCRM(String CRM) {
        if (CRM.length() > 0) {
            this.CRM = CRM;
            return true;
        } else
            return false;
    }

    // Especialidade Medico
    public String[] getEspecialidadesAtendidas() {
        return especialidadesAtendidas;
    }

    public boolean setEspecialidadesAtendidas(String[] especialidadesAtendidas) {
        this.especialidadesAtendidas = especialidadesAtendidas;
        return true;
    }

    // Valor limite para cada consulta
    public double getValorlimConsulta() {
        return valorlimConsulta;
    }

    public boolean setValorlim_consulta(int valorlim_consulta) {
        if (valorlim_consulta <= 0)
            return false;
        else {
            this.valorlimConsulta = valorlim_consulta;
            return true;
        }

    }

    public double getBonus() {
        return bonus;
    }

    public boolean setBonus(double bonus) {
        this.bonus = bonus;
        return true;
    }

    public boolean setValorlimConsulta(int valorlimConsulta) {
        this.valorlimConsulta = valorlimConsulta;
        return true;
    }

    public Medicos(String nome, String cpf, String rg, String estadoCivil, Endereco endereco, String usuario, String senha,
                   String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, double salarioBase, String cRM,
                   String[] especialidadesAtendidas, int valorlimConsulta, double valorConsulta, PlanoDeSaude[] planoDeSaude, double bonus) {
        super(nome, cpf, rg, estadoCivil, endereco, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase);
        CRM = cRM;
        if (!setEspecialidadesAtendidas(especialidadesAtendidas)) {
            throw new IllegalArgumentException("Ocorreu um erro ao informar as especialidades atendidas.");
        }
        if (!setValorlim_consulta(valorlimConsulta)) {
            throw new IllegalArgumentException("Valor Limite de consulta inserido incorretamente.");
        }
        if (!setValorConsulta(valorConsulta)) {
            throw new IllegalArgumentException("Valor de cada consulta inserido incorretamente.");
        }
        if (!setNroConsultas(nroConsultas = 0)) {
            throw new IllegalArgumentException("Numero de consultas inserido incorretamente.");
        }
        if (!setPlanoDeSaude(planoDeSaude)) {
            throw new IllegalArgumentException("Plano de saude inserido incorretamente.");
        }
        if (!setBonus(bonus)) {
            throw new IllegalArgumentException("Valor bonus inserido incorretamente.");
        }
    }


    @Override
    public String toString() {
        return super.toString()+" Medicos{" +
                "CRM='" + CRM + '\'' +
                ", especialidadesAtendidas=" + Arrays.toString(especialidadesAtendidas) +
                ", valorConsulta=" + valorConsulta +
                ", somaConsultasMes=" + somaConsultasMes +
                ", bonus=" + bonus +
                ", nroConsultas=" + nroConsultas +
                ", valorlimConsulta=" + valorlimConsulta +
                ", planoDeSaude=" + Arrays.toString(planoDeSaude) +
                '}';
    }
}
