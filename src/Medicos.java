public class Medicos extends Funcionarios {
    private String CRM, especialidadesAtendidas;
    private float salario, valorlim_consulta, valor_consulta;
    private int nro_consultas;

    //Valor de cada consulta
    public float getValor_consulta() {
        return valor_consulta;
    }

    public boolean setValor_consulta(float valor_consulta) {
        if(valor_consulta <= 0)
            return false;
        else{
            this.valor_consulta = valor_consulta;
            return true;
        }
    }

    // Numero de Consultas
    public int getNro_consultas() {
        return nro_consultas;
    }

    public boolean setNro_consultas(int nro_consultas) {
        if (nro_consultas < 0)
            return false;
        else {
            this.nro_consultas = nro_consultas;
            return true;
        }
    }

    // CRM
    public String getCRM() {
        return CRM;
    }

    public boolean setCRM(String CRM) {
        if (CRM.length() > 0) {
            this.CRM = CRM;
            return true;
        } else
            return false;
    }

    // Especialidade Medico
    public String getEspecialidadesAtendidas() {
        return especialidadesAtendidas;
    }

    public boolean setEspecialidadesAtendidas(String especialidadesAtendidas) {
        if (especialidadesAtendidas.length() > 0) {
            this.especialidadesAtendidas = especialidadesAtendidas;
            return true;
        } else
            return false;
    }

    // Valor limite para cada consulta
    public float getValorlim_consulta() {
        return valorlim_consulta;
    }

    public boolean setValorlim_consulta(float valorlim_consulta) {
        if (valorlim_consulta <= 0)
            return false;
        else {
            this.valorlim_consulta = valorlim_consulta;
            return true;
        }

    }

    // Salario
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        
        if(nro_consultas > valorlim_consulta){
            this.salario = nro_consultas * valor_consulta; 
        }
    }

}
