package Modules;

import java.util.Arrays;
import java.util.Date;

public abstract class Funcionarios extends Pessoas {
    private String usuario, senha, NumeroCarteiraDeTrabalho;
    private Date dataAdmissaoNaClinica;
    private double salarioBase;
    private Date tempoDeTrabalho;


    //Associate
    private Consulta[] consultas;

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

    // SALARIO BASE
    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        return true;
    }


    public Funcionarios(String nome, String cpf, String rg, String estadoCivil, String usuario, String senha,
                        String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, double salarioBase) {
        super(nome, cpf, rg, estadoCivil);
        setUsuario(usuario);
        setSenha(senha);
        setNumeroCarteiraDeTrabalho(numeroCarteiraDeTrabalho);
        setDataAdmissaoNaClinica(dataAdmissaoNaClinica);
        setSalarioBase(salarioBase);
    }

    public Funcionarios(String cpf) {
        super(cpf);
    }



    public Funcionarios() {
    }
    //5.b
    public abstract double calcularSalario();
    //5.c
    //Sempre que o usuário fizer o login, vai quardar em uma variavel a hora que logou, e quando sair, faz a subtração de quanto tempo ficou, joga esse valor para o banco de horas, e o calcular
    //salario vai dar um bonus dependendo de quantas horas ficou
    public abstract void loginClinica();
    public abstract void logoffClinica();

    @Override
    public String toString() {
        return super.toString()+" Funcionarios{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", NumeroCarteiraDeTrabalho='" + NumeroCarteiraDeTrabalho + '\'' +
                ", dataAdmissaoNaClinica=" + dataAdmissaoNaClinica +
                ", salarioBase=" + salarioBase +
                ", tempoDeTrabalho=" + tempoDeTrabalho +
                ", consultas=" + Arrays.toString(consultas) +
                '}';
    }
}
