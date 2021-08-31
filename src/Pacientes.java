import java.sql.Date;

public class Pacientes {
    private String nome;
    private String cpf;
    private String rg;
    private byte estadoCivil;
    private Date dataUltimaConsulta;
    private String sexo;
    private Date dateNascimento;
    private Date dataCadastro;

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

    // DATA DA ÚLTIMA CONSULTA
    public Date getDataUltimaConsulta() {
        return dataUltimaConsulta;
    }

    public boolean setDataUltimaConsulta(Date dataUltimaConsulta) {
        this.dataUltimaConsulta = dataUltimaConsulta;
        return true;
    }

    // SEXO
    public String getSexo() {
        return sexo;
    }

    public boolean setSexo(String sexo) {
        this.sexo = sexo;
        return true;
    }

    // DATA DE NASCIMENTO
    public Date getDateNascimento() {
        return dateNascimento;
    }

    public boolean setDateNascimento(Date dateNascimento) {
        this.dateNascimento = dateNascimento;
        return true;
    }

    // DATA DE CADASTRO
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public boolean setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
        return true;
    }
    //MÉTODOS

    public Pacientes(String nome, String cpf, byte estadoCivil, String sexo, Date dateNascimento, Date dataCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.dateNascimento = dateNascimento;
        this.dataCadastro = dataCadastro;
    }

}
