package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {
    @Id
    private Long id;
    private String rua, complemento, bairro, cidade, numero, cep;

    public Endereco(String rua, String complemento, String bairro, String cidade, String numero, String cep) {
        if (!setRua(rua)) {
            throw new IllegalArgumentException("O nome da rua não esta correta.");
        }
        if (!setComplemento(complemento)) {
            throw new IllegalArgumentException("O complemento não está correto.");
        }
        if (!setBairro(bairro)) {
            throw new IllegalArgumentException("O nome do bairro não está correto.");
        }
        if (!setCidade(cidade)) {
            throw new IllegalArgumentException("O nome da cidade não está correto.");
        }
        if (!setNumero(numero)) {
            throw new IllegalArgumentException("O numero da rua não está correto.");
        }
        if (!setCep(cep)) {
            throw new IllegalArgumentException("O cep não está correto.");
        }
    }

    public Endereco() {

    }

    //Rua
    public String getRua() {
        return rua;
    }
    public boolean setRua(String rua) {
        if (rua.isEmpty()) {
            return false;
        } else if (rua.length() > 50) {
            return false;
        } else {
            this.rua = rua;
            return true;
        }
    }

    //Complemento
    public String getComplemento() {
        return complemento;
    }

    public boolean setComplemento(String complemento) {
        if (complemento.isEmpty()) {
            return false;
        } else {
            this.complemento = complemento;
            return true;
        }
    }
    //Bairro
    public String getBairro() {
        return bairro;
    }

    public boolean setBairro(String bairro) {
        if (bairro.isEmpty()) {
            return false;
        } else {
            this.bairro = bairro;
            return true;
        }
    }

    //Cidade
    public String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        if (cidade.isEmpty()) {
            return false;
        } else {
            this.cidade = cidade;
            return true;
        }

    }

    //NUMERO
    public String getNumero() {
        return numero;
    }

    public boolean setNumero(String numero) {
        if (numero.isEmpty()) {
            return false;
        } else {
            this.numero = numero;
            return true;
        }

    }

    //CEP
    public String getCep() {
        return cep;
    }

    public boolean setCep(String cep) {
        if (cep.isEmpty()) {
            return false;
        } else {
            this.cep = cep;
            return true;
        }
    }
}
