public class PlanoDeSaude  {
    private String nome, cnpj;

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        this.nome = nome;
        return true;
    }

    public String getCnpj() {
        return cnpj;
    }

    public boolean setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return true;
    }

    public PlanoDeSaude(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }


}
