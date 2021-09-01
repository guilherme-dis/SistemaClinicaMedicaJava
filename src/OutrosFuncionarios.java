import java.sql.Date;

public class OutrosFuncionarios extends Funcionarios {
    private float salario_fixo;
    private float valor_gratificacao;
    private String cargo;
    private int nro_consultas;
    private float valorlim_consulta;
    /*
    Setar previamente valores de: valor_gratificacao, salario_fixo,
    nro_consultas,valorlim_consultas
    */

    // Metodo Cria OutrosFuncionarios
    // Parametro: salario_fixo, gratificacao, cargo
    // Retorno: Seta valores nas variaveis principais referentes
    

    // Valor de gratificacao
    public float getValor_gratificacao() {
        return valor_gratificacao;
    }

    public OutrosFuncionarios(String nome, String cpf, String rg, String usuario, String senha,
            String numeroCarteiraDeTrabalho, byte estadoCivil, Date dataAdmissaoNaClinica, float salarioBase,
            float salario_fixo, float valor_gratificacao, String cargo, int nro_consultas, float valorlim_consulta) {
        super(nome, cpf, rg, usuario, senha, numeroCarteiraDeTrabalho, estadoCivil, dataAdmissaoNaClinica, salarioBase);
        this.salario_fixo = salario_fixo;
        this.valor_gratificacao = valor_gratificacao;
        this.cargo = cargo;
        this.nro_consultas = nro_consultas;
        this.valorlim_consulta = valorlim_consulta;
    }

    public boolean setValor_gratificacao(float valor_gratificacao) {
        if (valor_gratificacao <= 0) {
            return false;
        } else {
            this.valor_gratificacao = valor_gratificacao;
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
            salario_fixo += valor_gratificacao;
        }

    }

}
