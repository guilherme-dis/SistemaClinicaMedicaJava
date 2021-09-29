package Modules;



public class PlanoDeSaude  {
    private String nome, CNPJ;

    public String getNome() {
        return nome;
    }

    public boolean setNome( String nome) {
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

    public PlanoDeSaude(String nome, String cnpj) {
        setNome(nome);
        setCnpj(cnpj);
    }
    public static PlanoDeSaude cadastrar(String nome, String cnpj){
        return new PlanoDeSaude(nome,cnpj);
    }

    @Override
    public String toString() {
        return "PlanoDeSaude{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                '}';
    }


}
