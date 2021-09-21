package Modules;
public class Endereco {
    private String rua, complemento, bairro, cidade;
    private int numero, cep;

    //Metodo Cria Endereço
    //Recebe como parametros as informacoes do endereco
    //Rua , Complemento (apto/casa), bairro, cidade, numero e cep
    public Endereco(String rua, String complemento, String bairro, String cidade, int numero, int cep) {
        setRua(rua);
        setComplemento(complemento);
        setBairro(bairro);
        setCidade(cidade);
        setNumero(numero);
        setCep(cep);
    }
    //Rua
    public String getRua() {
        return rua;
    }

    public boolean setRua(String rua) {
        if(rua.length() > 0)
        {
            this.rua = rua;
            return true;
        }
        else    
            return false;
    }
    //Complemento
    public String getComplemento() {
        return complemento;
    }

    public boolean setComplemento(String complemento) {
        if(complemento.length() > 0){
            this.complemento = complemento;
            return true;
        }else
            return false;
    }
    //Bairro
    public String getBairro() {
        return bairro;
    }

    public boolean setBairro(String bairro) {
        if(bairro.length() > 0){
            this.bairro = bairro;
            return true;
        }else
            return false;
    }
    //Cidade
    public String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        if(cidade.length() > 0){
            this.cidade = cidade;
            return true;
        }else
            return false;
    }
    //Numero
    public int getNumero() {
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero < 0)
            return false;
        else{
            this.numero = numero;
            return true;
        }
    }
    //Cep
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    
}
