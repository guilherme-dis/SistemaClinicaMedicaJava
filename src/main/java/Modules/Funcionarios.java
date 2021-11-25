package Modules;

import javax.swing.*;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Date;

public abstract class Funcionarios extends Pessoas {

    private String usuario, senha, NumeroCarteiraDeTrabalho;
    private Date dataAdmissaoNaClinica;
    private Date tempoDeTrabalho;
    private Consulta[] consultas;

    public abstract double calcularSalario();

    // USUARIO
    public String getUsuario() {
        return usuario;
    }

    public boolean setUsuario(String usuario) {
        if (usuario.length() < 1) {
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
        if (senha.length() < 1) {
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
        if (numeroCarteiraDeTrabalho.length() < 1) {
            return false;
        }
        NumeroCarteiraDeTrabalho = numeroCarteiraDeTrabalho;
        return true;
    }

    // DATA DE ADMISSÃO NA CLINICA
    public Date getDataAdmissaoNaClinica() {
        return dataAdmissaoNaClinica;
    }

    public boolean setDataAdmissaoNaClinica(Date dataAdmissaoNaClinica) {
        this.dataAdmissaoNaClinica = dataAdmissaoNaClinica;
        return true;
    }

    public Funcionarios(String nome, String cpf, String rg, String estadoCivil, Endereco endereco, String usuario, String senha,
            String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica) {
        super(nome, cpf, rg, estadoCivil, endereco);
        setUsuario(usuario);
        setSenha(senha);
        setNumeroCarteiraDeTrabalho(numeroCarteiraDeTrabalho);
        setDataAdmissaoNaClinica(dataAdmissaoNaClinica);

    }

    @Override
    public String toString() {
        return super.toString() + " Funcionarios{"
                + "usuario='" + usuario + '\''
                + ", senha='" + senha + '\''
                + ", NumeroCarteiraDeTrabalho='" + NumeroCarteiraDeTrabalho + '\''
                + ", dataAdmissaoNaClinica=" + dataAdmissaoNaClinica
                + ", tempoDeTrabalho=" + tempoDeTrabalho
                + ", consultas=" + Arrays.toString(consultas)
                + '}';
    }
}
