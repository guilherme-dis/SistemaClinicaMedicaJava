package DataClass;

import Modules.Persist;
import Modules.PlanoDeSaude;

import java.util.ArrayList;

public class DadosPlanosDeSaude {
    private static ArrayList<PlanoDeSaude> planoDeSaudeArrayList = new ArrayList<>();

    public static boolean inicializaPlanoDeSaude() {
        planoDeSaudeArrayList = (ArrayList<PlanoDeSaude>) Persist.recuperar("src/DataSource/PlanoDeSaude.dat");
        if (planoDeSaudeArrayList == null) {
            planoDeSaudeArrayList = new ArrayList<>();
        }
        return true;
    }

    public static boolean cadastrar(PlanoDeSaude c) {

        if(buscar(c.getNome())==null){
            planoDeSaudeArrayList.add(c);
            return true;
        }
        else System.out.println("Plano de saude já esta cadastrado");
        return true;


    }
    public static boolean gravar(){
        Persist.gravar(planoDeSaudeArrayList, "src/DataSource/PlanoDeSaude.dat");
        return true;
    }

    public static void listar() {
        for (PlanoDeSaude objeto : planoDeSaudeArrayList) System.out.println(objeto);
    }

    public static PlanoDeSaude buscar(String nome) {
        return planoDeSaudeArrayList.stream().filter(objeto -> objeto.getNome().equals(nome)).findFirst().orElse(null);
    }

    public static boolean excluir(String nome) {
        PlanoDeSaude c = buscar(nome);
        if (c != null) {
            planoDeSaudeArrayList.remove(c);
            return true;
        }
        return false;
    }
}
