package Modules;
import java.util.Arrays;
import java.util.Date;

public class Pacientes extends Pessoas{
    private Date dataUltimaConsulta;
    private String sexo;
    private Date dateNascimento;
    private Date dataCadastro;

    private Funcionarios [] funcionarios;
    private Consulta consulta;
    

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
    //CONSTRUTOR
    public Pacientes(String nome, String cpf, String rg, String estadoCivil, String sexo,
            Date dateNascimento, Date dataCadastro) {
        super(nome, cpf, rg, estadoCivil);
        setSexo(sexo);
        setDateNascimento(dateNascimento);
        setDataCadastro(dataCadastro);
    }
    @Override
    public String toString() {
        return "Pacientes{" +
                "dataUltimaConsulta=" + dataUltimaConsulta +
                ", sexo='" + sexo + '\'' +
                ", dateNascimento=" + dateNascimento +
                ", dataCadastro=" + dataCadastro +
                ", funcionarios=" + Arrays.toString(funcionarios) +
                ", consulta=" + consulta +
                '}';
    }
}
