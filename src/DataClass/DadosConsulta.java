package DataClass;

import Modules.Consulta;
import Modules.Exames;
import Modules.Persist;

import java.util.ArrayList;

public class DadosConsulta {
    private static  ArrayList<Consulta> consultaArrayList = new ArrayList<>();

    public static boolean inicializaConsulta(){
        consultaArrayList=(ArrayList<Consulta>) Persist.recuperar("src/DataSource/Consulta.dat");
        if(consultaArrayList==null){
            consultaArrayList=new ArrayList<>();
        }
        return true;
    }

    public static boolean cadastrar(Consulta c) {
            consultaArrayList.add(c);
            return true;
    }
    public static boolean gravar(){
        Persist.gravar(consultaArrayList, "src/DataSource/Consulta.dat");
        return true;
    }

    public static void listar() {
        for (Consulta objeto : consultaArrayList) System.out.println(objeto);
    }

    public static Consulta buscar(String cpf) {//pode-se usar também int
        Consulta c = null;
        for (Consulta objeto : consultaArrayList) {
            if (objeto.getPaciente().getCpf().equals(cpf)) {
                c = objeto;
                break;
            }
        }
        if(c==null){
            throw new IllegalArgumentException("Não foi encontrado consulta para esse paciente.");
        }
        return c;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String cpf) {
        Consulta c = buscar(cpf);
        if (c != null) {
            consultaArrayList.remove(c);
            return true;
        }
        return false;
    }
}
