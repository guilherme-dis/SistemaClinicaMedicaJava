package Modules;


import java.io.Serializable;

public class PlanoDeSaude  implements Serializable {
    private String nome, CNPJ;

    //CONSTRUTOR
    public PlanoDeSaude(String nome, String cnpj) {
        if (!setNome(nome)) {
            System.err.println("O nome do plano de saude não pode ser vazio;");
            throw new IllegalArgumentException();
        }
        setCnpj(cnpj);
    }
    public String getNome() {
        return nome;
    }

    public boolean setNome( String nome) {
        if(nome.isEmpty()){
            return false;
        }
        this.nome = nome;
        return true;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public boolean setCnpj(String cnpj) {
        this.CNPJ = cnpj;
        return true;
    }

    @Override
    public String toString() {
        return "PlanoDeSaude{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                '}';
    }


}
