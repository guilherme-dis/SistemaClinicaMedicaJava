import java.sql.Date;


public class Medicos extends Funcionarios {
    private String CRM, especialidadesAtendidas;
    private float salario, valorlim_consulta, valor_consulta;
    private int nro_consultas,SomaConsultasMes;


    //Associação com plano de saude
    private PlanoDeSaude[] planoDeSaude;
    
    public Medicos(String cpf, PlanoDeSaude[] planoDeSaude) {
        super(cpf);
        this.planoDeSaude = planoDeSaude;
    }

    public PlanoDeSaude[] getPlanoDeSaude() {
        return planoDeSaude;
    }

    public boolean setPlanoDeSaude(PlanoDeSaude[] planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
        return true;
    }

    //Valor de cada consulta
    public float getValor_consulta() {
        return valor_consulta;
    }

    public boolean setValor_consulta(float valor_consulta) {
        if(valor_consulta <= 0)
            return false;
        else{
            this.valor_consulta = valor_consulta;
            return true;
        }
    }

    // Numero de Consultas
    public int getNro_consultas() {
        return nro_consultas;
    }

    public boolean setNro_consultas(int nro_consultas) {
        if (nro_consultas < 0)
            return false;
        else {
            this.nro_consultas = nro_consultas;
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
    public String getEspecialidadesAtendidas() {
        return especialidadesAtendidas;
    }

    public boolean setEspecialidadesAtendidas(String especialidadesAtendidas) {
        if (especialidadesAtendidas.length() > 0) {
            this.especialidadesAtendidas = especialidadesAtendidas;
            return true;
        } else
            return false;
    }

    // Valor limite para cada consulta
    public float getValorlim_consulta() {
        return valorlim_consulta;
    }

    public boolean setValorlim_consulta(float valorlim_consulta) {
        if (valorlim_consulta <= 0)
            return false;
        else {
            this.valorlim_consulta = valorlim_consulta;
            return true;
        }

    }

    // Salario
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        
        if(nro_consultas > valorlim_consulta){
            this.salario = nro_consultas * valor_consulta; 
        }
    }

    public Medicos(String nome, String cpf, String rg, byte estadoCivil, String usuario, String senha,
            String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, float salarioBase, String cRM,
            String especialidadesAtendidas, float salario, float valorlim_consulta, float valor_consulta,
            int nro_consultas, PlanoDeSaude[] planoDeSaude) {
        super(nome, cpf, rg, estadoCivil, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase);
        CRM = cRM;
        this.especialidadesAtendidas = especialidadesAtendidas;
        this.salario = salario;
        this.valorlim_consulta = valorlim_consulta;
        this.valor_consulta = valor_consulta;
        this.nro_consultas = nro_consultas;
        this.planoDeSaude = planoDeSaude;
    }

    public boolean resetSomaConsultaMes(){
        this.SomaConsultasMes=0;
        return true;
    }
    //Metodo para calcular o salário

}
