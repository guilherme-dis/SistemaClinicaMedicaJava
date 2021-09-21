package Modules;
public class Exames {
    private String nome_exame;

    public Exames(String nome_exame) {
        setNome_exame(nome_exame);
    }

    public String getNome_exame() {
        return nome_exame;
    }

    public boolean setNome_exame(String nome_exame) {
        if(nome_exame.length() > 0){
            this.nome_exame = nome_exame;
            return true;
        }else
            return false;
    }
}
