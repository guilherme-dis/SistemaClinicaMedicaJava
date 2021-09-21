package Modules;

import java.util.Date;

public class Funcionarios extends Pessoas {
    private String usuario, senha, NumeroCarteiraDeTrabalho;
    private Date dataAdmissaoNaClinica;
    private float salarioBase;

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
    public float getSalarioBase() {
        return salarioBase;
    }

    public boolean setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
        return true;
    }


    public Funcionarios(String nome, String cpf, String rg, String estadoCivil, String usuario, String senha,
                        String numeroCarteiraDeTrabalho, Date dataAdmissaoNaClinica, float salarioBase) {
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

}
