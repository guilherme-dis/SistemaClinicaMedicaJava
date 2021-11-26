package entity;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Medicos extends Funcionarios {
    private String CRM;
    private double valorConsulta, bonus;
    private int nroConsultas = 0, valorlimConsulta;
    @OneToMany
    @JoinColumn(name = "plano_id", referencedColumnName = "id")
    private List<PlanoDeSaude> planoDeSaude;


    public Medicos(String nome, String cpf, String rg, String estadoCivil, Endereco endereco, String usuario, String senha,
                   String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, String cRM, int valorlimConsulta, double valorConsulta, double bonus) {
        super(nome, cpf, rg, estadoCivil, endereco, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica);
        CRM = cRM;
//        if (!setEspecialidadesAtendidas(especialidadesAtendidas)) {
//            throw new IllegalArgumentException("Ocorreu um erro ao informar as especialidades atendidas.");
//        }
        if (!setValorlim_consulta(valorlimConsulta)) {
            throw new IllegalArgumentException("Valor Limite de consulta inserido incorretamente.");
        }
        if (!setValorConsulta(valorConsulta)) {
            throw new IllegalArgumentException("Valor de cada consulta inserido incorretamente.");
        }
        if (!setNroConsultas(nroConsultas = 0)) {
            throw new IllegalArgumentException("Numero de consultas inserido incorretamente.");
        }
//        if (!setPlanoDeSaude(planoDeSaude)) {
//            throw new IllegalArgumentException("Plano de saude inserido incorretamente.");
//        }
        if (!setBonus(bonus)) {
            throw new IllegalArgumentException("Valor bonus inserido incorretamente.");
        }
    }

    public Medicos() {
        super();
    }


    public double calcularSalario() {
        return (nroConsultas < valorlimConsulta) ? valorConsulta * nroConsultas : (valorConsulta * nroConsultas) + bonus;
    }


    public List<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
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


    @Override
    public String toString() {
        return "Medicos{" +
                "CRM='" + CRM + '\'' +
                ", valorConsulta=" + valorConsulta +
                ", bonus=" + bonus +
                ", nroConsultas=" + nroConsultas +
                ", valorlimConsulta=" + valorlimConsulta +
                ", planoDeSaude=" + planoDeSaude +
                '}';
    }
}
