import java.sql.Date;

public class OutrosFuncionarios extends Funcionarios {
    private float salario_fixo;
    private float valorGratificacao;
    private String cargo;
    private int nro_consultas;
    private float valorlim_consulta;
    private static float valorASerPagoDeGratificacao;

    /*
     * Setar previamente valores de: valorGratificacao, salario_fixo,
     * nro_consultas,valorlim_consultas
     */

    // Metodo Cria OutrosFuncionarios
    // Parametro: salario_fixo, gratificacao, cargo
    // Retorno: Seta valores nas variaveis principais referentes

    public static float getValorASerPagoDeGratificacao() {
        return valorASerPagoDeGratificacao;
    }

    public static boolean setValorASerPagoDeGratificacao(float valorASerPagoDeGratificacao) {
        OutrosFuncionarios.valorASerPagoDeGratificacao = valorASerPagoDeGratificacao;
        return true;
    }

    // Valor de gratificacao
    public float getvalorGratificacao() {
        return valorGratificacao;
    }

    public OutrosFuncionarios(String nome, String cpf, String rg, byte estadoCivil, String usuario, String senha,
            String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, float salarioBase, float salario_fixo,
            float valorGratificacao, String cargo, int nro_consultas, float valorlim_consulta) {
        super(nome, cpf, rg, estadoCivil, usuario, senha, numeroCarteiraDeTrabalho, dataAdmissaoNaClinica, salarioBase);
        this.salario_fixo = salario_fixo;
        this.valorGratificacao = valorGratificacao;
        this.cargo = cargo;
        this.nro_consultas = nro_consultas;
        this.valorlim_consulta = valorlim_consulta;
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
    public float getSalario_fixo() {
        return salario_fixo;
    }

    public boolean setSalario_fixo(float salario_fixo) {
        if (salario_fixo <= 0)
            return false;
        else {
            this.salario_fixo = salario_fixo;
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
        if (nro_consultas > valorlim_consulta) {
            salario_fixo += valorGratificacao;
        }

    }
    public float calcularSalario(){
        if(Consulta.getLimiteConsultas()<=Consulta.getNroConsultas()){
            return salario_fixo+valorGratificacao;
        }
        return salario_fixo;
    }
}
