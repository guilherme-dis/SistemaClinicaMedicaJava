package Modules;

import java.io.Serializable;
import java.util.Objects;

public class Pessoas implements Serializable {
    private String nome, cpf, rg;
    private byte estadoCivil;
    private Endereco endereco;

    //CONSTRUTOR
    public Pessoas(String nome, String cpf, String rg, String estadoCivil, Endereco endereco) {
        if (!setNome(nome)) {
            throw new IllegalArgumentException("O nome não esta correto ou não foi inserido! Tem que ter menos de 50 caracteres.");
        }if(!setCpf(cpf)){
            throw new IllegalArgumentException("O cpf não está correto.");
        }if(!setRg(rg)){
            throw new IllegalArgumentException("O rg não está correto.");
        }if(!setEstadoCivil(estadoCivil)){
            throw new IllegalArgumentException("A entrada o estado civil está errado. Digite ('Solteiro','Casado','Divorciado').");
        }
        setEndereco(endereco);
    }

    // NOME
    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.isEmpty()) {
            return false;
        } else if (nome.length() > 50) {
            return false;
        }
        this.nome = nome;
        return true;

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
            return "Solteiro";
        } else if (this.estadoCivil == 1) {
            return "Casado";
        }
        return "Divorciado";
    }
    public boolean setEstadoCivil(String estadoCivil) {
        estadoCivil=estadoCivil.toLowerCase();
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


    //ENDERECO
    public Endereco getEndereco() {
        return endereco;
    }

    public boolean setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return true;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", estadoCivil=" + getEstadoCivil() +
                ", endereco=" + endereco +
                '}';
    }

    public Pessoas(String cpf) {
        this.cpf = cpf;
    }

    public Pessoas() {
    }
}
