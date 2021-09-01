import java.sql.Date;

public class Funcionarios {
    private String nome, cpf, rg, usuario, senha, NumeroCarteiraDeTrabalho;
    private byte estadoCivil;
    private Date dataAdmissaoNaClinica;
    private float salarioBase;

    // NOME
    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
            return true;
        } else
            return false;

    }

    // CPF
    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        if (ValidaCPF.isCPF(cpf)) {
            this.cpf = cpf;
            return true;
        } else
            return false;
    }

    // RG
    public String getRg() {
        return rg;
    }

    public boolean setRg(String rg) {
        if (rg.length() != 8) {
            return false;
        }
        this.rg = rg;
        return true;
    }

    // USUARIO
    public String getUsuario() {
        return usuario;
    }

    public boolean setUsuario(String usuario) {
        if(usuario.length()<1){
            return false;
        }
        this.usuario = usuario;
        return true;
    }

    // SENHA
    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        if(senha.length()<1){
            return false;
        }
        this.senha = senha;
        return true;
    }

    // CARTEIRA DE TRABALHO
    public String getNumeroCarteiraDeTrabalho() {
        return NumeroCarteiraDeTrabalho;
    }

    public boolean setNumeroCarteiraDeTrabalho(String numeroCarteiraDeTrabalho) {
        if(numeroCarteiraDeTrabalho.length()<1){
            return false;
        }
        NumeroCarteiraDeTrabalho = numeroCarteiraDeTrabalho;
        return true;
    }

    // ESTADO CIVIL
    public String getEstadoCivil() {
        if (this.estadoCivil == 0) {
            return "solteiro";
        } else if (this.estadoCivil == 1) {
            return "casado";
        }
        return "divorciado";
    }

    public boolean setEstadoCivil(String estadoCivil) {
        if (estadoCivil == "solteiro") {
            this.estadoCivil = 0;
            return true;
        }
        if (estadoCivil == "casado") {
            this.estadoCivil = 1;
            return true;
        }
        if (estadoCivil == "divorciado") {
            this.estadoCivil = 2;
            return true;
        }

        return false;
    }

    // DATA DE ADMISSÃO NA CLINICA
    public Date getDataAdmissaoNaClinica() {
        return dataAdmissaoNaClinica;
    }

    public boolean setDataAdmissaoNaClinica(Date dataAdmissaoNaClinica) {
        this.dataAdmissaoNaClinica = dataAdmissaoNaClinica;
        return true;
    }

    // SALARIO BASE
    public float getSalarioBase() {
        return salarioBase;
    }

    public boolean setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
        return true;
    }

    public Funcionarios(String nome, String cpf, String rg, String usuario, String senha,
            String numeroCarteiraDeTrabalho, byte estadoCivil, Date dataAdmissaoNaClinica, float salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
        NumeroCarteiraDeTrabalho = numeroCarteiraDeTrabalho;
        this.estadoCivil = estadoCivil;
        this.dataAdmissaoNaClinica = dataAdmissaoNaClinica;
        this.salarioBase = salarioBase;
    }

    public Funcionarios(String cpf) {
        this.cpf = cpf;
    }

}
