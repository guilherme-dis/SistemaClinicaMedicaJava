/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

/**
 *
 * @author guilh
 */
public class Config {
    private  int limiteConsultas;
    private  int nroConsultas;

    public int getLimiteConsultas() {
        return limiteConsultas;
    }

    public void setLimiteConsultas(int limiteConsultas) {
        this.limiteConsultas = limiteConsultas;
    }

    public int getNroConsultas() {
        return nroConsultas;
    }

    public void setNroConsultas(int nroConsultas) {
        this.nroConsultas = nroConsultas;
    }
    
    public  void resetConsultas() {
        setNroConsultas(0);
    }
    
}
