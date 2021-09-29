package DataClass;

import Modules.Consulta;

import java.util.ArrayList;

public class DadosConsulta {
    private final ArrayList<Consulta> consultaArrayList = new ArrayList<>();

    public void cadastrar(Consulta c) {
        this.consultaArrayList.add(c);
    }

    public void listar() {
        for (Consulta objeto : this.consultaArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public Consulta buscar(String cpf) {//pode-se usar também int
        Consulta c = null;
        for (Consulta objeto : this.consultaArrayList) {
            if (objeto.getPaciente().getCpf().equals(cpf)) {
                c = objeto;
                break;
            }
        }
        //System.err.println("Paciente não encontrado!");
        return c;
    }

    //este método usa o método buscar já implementado
    public boolean excluir(String cpf) {
        Consulta c = this.buscar(cpf);
        if (c != null) {
            this.consultaArrayList.remove(c);
            return true;
        } else return false;
    }
}
