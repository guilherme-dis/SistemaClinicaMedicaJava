package entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class PlanoDeSaude  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome, CNPJ;

    public PlanoDeSaude() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
