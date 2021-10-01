package DataClass;


import Modules.Pacientes;
import Modules.Persist;

import java.util.ArrayList;

public class DadosPacientes {
    private static ArrayList<Pacientes> pacientesArrayList = new ArrayList<>();

    public static boolean inicializaPacientes() {
        pacientesArrayList = (ArrayList<Pacientes>) Persist.recuperar("src/DataSource/Pacientes.dat");
        if (pacientesArrayList == null) {
            pacientesArrayList = new ArrayList<>();
        }
        return true;
    }

    public static boolean cadastrar(Pacientes c) {
        pacientesArrayList.add(c);
        Persist.gravar(pacientesArrayList, "src/DataSource/Pacientes.dat");
        return true;
    }

    public static void listar() {
        for (Pacientes objeto : pacientesArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public static Pacientes buscar(String cpf) {//pode-se usar também int
        Pacientes c = null;
        for (Pacientes objeto : pacientesArrayList) {
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
    public static boolean excluir(String cpf) {
        Pacientes c = buscar(cpf);
        if (c != null) {
            pacientesArrayList.remove(c);
            return true;
        }
        return false;
    }
}
