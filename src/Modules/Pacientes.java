package Modules;

import java.io.Serializable;
import java.util.Date;

public class Pacientes extends Pessoas  {
    private Date dataUltimaConsulta;
    private String sexo;
    private Date dateNascimento;
    private Date dataCadastro;

    //CONSTRUTOR
    public Pacientes(String nome, String cpf, String rg, String estadoCivil,Endereco endereco, String sexo,
                     Date dateNascimento, Date dataCadastro) {
        super(nome, cpf, rg, estadoCivil, endereco);
        if (!setSexo(sexo)) {
            throw new IllegalArgumentException("Houve algum erro com a criação do sexo;");
        } else if (!setDateNascimento(dateNascimento)) {
            throw new IllegalArgumentException("Data de Nascimento invalido;");
        } else if (!setDataCadastro(dataCadastro)) {
            throw new IllegalArgumentException("Data de Cadastro invalido;");
        }
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


    @Override
    public String toString() {
        return super.toString()+"Pacientes{" +
                "dataUltimaConsulta=" + dataUltimaConsulta +
                ", sexo='" + sexo + '\'' +
                ", dateNascimento=" + dateNascimento +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
