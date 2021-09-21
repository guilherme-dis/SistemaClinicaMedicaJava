package Modules;
import java.util.Date;

public class OutrosFuncionarios extends Funcionarios {
    private float salarioFixo;
    private float valorGratificacao;
    private String cargo;
    private int nroConsultas;
    private float valorlim_consulta;

    //3.f
    private static float valorASerPagoDeGratificacao;
    public static float getValorASerPagoDeGratificacao() {
        return valorASerPagoDeGratificacao;
    }
    public static boolean setValorASerPagoDeGratificacao(float valorASerPagoDeGratificacao) {
        OutrosFuncionarios.valorASerPagoDeGratificacao = valorASerPagoDeGratificacao;
        return true;
    }
    //3.i
    public float calcularSalario(){
        if(Consulta.getLimiteConsultas()<=Consulta.getNroConsultas()){

            return salarioFixo+valorGratificacao;
        }
        return salarioFixo;
    }

    // Valor de gratificacao
    public float getvalorGratificacao() {
        return valorGratificacao;
    }

    public OutrosFuncionarios(String nome, String cpf, String rg, String estadoCivil, String usuario, String senha,
            String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, float salarioBase, float salarioFixo,
            float valorGratificacao, String cargo, int nroConsultas, float valorlim_consulta) {
        super(nome, cpf, rg, estadoCivil, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase);
        setsalarioFixo(salarioFixo);
        setvalorGratificacao(valorGratificacao);
        setCargo(cargo);
        setnroConsultas(nroConsultas);
        setValorlim_consulta(valorlim_consulta);
    }

    public boolean setvalorGratificacao(float valorGratificacao) {
        if (valorGratificacao <= 0) {
            return false;
        } else {
            this.valorGratificacao = valorGratificacao;
            return true;
        }
    }

    // Numeros de consultas realizadas
    public int getNroConsultas() {
        return nroConsultas;
    }

    public boolean setnroConsultas(int nroConsultas) {
        if (nroConsultas < 0)
            return false;
        else {
            this.nroConsultas = nroConsultas;
            return true;
        }
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
    public float getsalarioFixo() {
        return salarioFixo;
    }

    public boolean setsalarioFixo(float salarioFixo) {
        if (salarioFixo <= 0)
            return false;
        else {
            this.salarioFixo = salarioFixo;
            return true;
        }
    }

    // Cargo
    public String getCargo() {
        return cargo;
    }

    public boolean setCargo(String cargo) {
        if (cargo.length() > 0) {
            this.cargo = cargo;
            return true;
        } else
            return false;
    }

    public void confere_gratificacao() {
        if (nroConsultas > valorlim_consulta) {
            salarioFixo += valorGratificacao;
        }

    }

    public float getValorGratificacao() {
        return valorGratificacao;
    }

    public boolean setValorGratificacao(float valorGratificacao) {
        this.valorGratificacao = valorGratificacao;
        return true;
    }

    public boolean setNroConsultas(int nroConsultas) {
        this.nroConsultas = nroConsultas;
        return true;
    }
}
