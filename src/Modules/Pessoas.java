package Modules;

import java.util.Objects;
//TODO fazer o endereço entrar como construtor de todo mundo

public class Pessoas {
    private String nome, cpf, rg;
    private byte estadoCivil;

    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public boolean setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return true;
    }

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
        if (Objects.equals(estadoCivil, "solteiro")) {
            this.estadoCivil = 0;
            return true;
        }
        if (Objects.equals(estadoCivil, "casado")) {
            this.estadoCivil = 1;
            return true;
        }
        if (Objects.equals(estadoCivil, "divorciado")) {
            this.estadoCivil = 2;
            return true;
        }

        return false;
    }

    public Pessoas(String nome, String cpf, String rg, String estadoCivil) {
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setEstadoCivil(estadoCivil);
    }

    public Pessoas(String cpf) {
        this.cpf = cpf;
    }
    public Pessoas(){}
}
