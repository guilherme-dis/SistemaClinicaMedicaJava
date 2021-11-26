package entity;

import Modules.ValidaCPF;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public class Pessoas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, cpf, rg;
    private byte estadoCivil;
    @OneToOne
    @JoinColumn(name="endereco_id",referencedColumnName = "id")
    private Endereco endereco;

    //CONSTRUTOR
    public Pessoas(String nome, String cpf, String rg, String estadoCivil, Endereco endereco) {
        if (!setName(nome)) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    // NOME
    public String getName() {
        return name;
    }

    public boolean setName(String nome) {
        if (nome.isEmpty()) {
            return false;
        } else if (nome.length() > 50) {
            return false;
        }
        this.name = nome;
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
                "nome='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", estadoCivil=" + getEstadoCivil() +
                ", endereco=" + endereco +
                '}';
    }


    public Pessoas() {
    }
}
