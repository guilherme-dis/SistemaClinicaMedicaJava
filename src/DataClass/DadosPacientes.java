package DataClass;


import Modules.Pacientes;
import Modules.Persist;

import java.util.ArrayList;

public class DadosPacientes {
    private static ArrayList<Pacientes> pacientesArrayList = new ArrayList<>();
    public static void inicializaPacientes(){
        pacientesArrayList=(ArrayList<Pacientes>)Persist.recuperar("Pacientes.dat");
        if(pacientesArrayList==null){
            pacientesArrayList=new ArrayList<Pacientes>();
        }
    }
    public static void cadastrar(Pacientes c) {
        pacientesArrayList.add(c);
        Persist.gravar(c, "Pacientes.dat");
    }

    public static void listar() {
        for (Pacientes objeto : pacientesArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public Pacientes buscar(String cpf) {//pode-se usar também int
        Pacientes c = null;
        for (Pacientes objeto : this.pacientesArrayList) {
            if (objeto.getCpf().equals(cpf)) {
                c = objeto;
                break;
            }
        }
        if (c == null) {
            System.err.println("CPF do paciente não encontrado!");
        }
        return c;
    }

    //este método usa o método buscar já implementado
    public boolean excluir(String cpf) {
        Pacientes c = this.buscar(cpf);
        if (c != null) {
            this.pacientesArrayList.remove(c);
            return true;
        } else return false;
    }
}
