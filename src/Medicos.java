public class Medicos extends Funcionarios{
    private String CRM,especialidadesAtendidas;
    private float salario;
    public String getCRM() {
        return CRM;
    }
    public void setCRM(String cRM) {
        CRM = cRM;
    }
    public String getEspecialidadesAtendidas() {
        return especialidadesAtendidas;
    }
    public void setEspecialidadesAtendidas(String especialidadesAtendidas) {
        this.especialidadesAtendidas = especialidadesAtendidas;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
