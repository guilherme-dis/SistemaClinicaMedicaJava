package Modules;

import java.util.ArrayList;

public class DadosPlanosDeSaude {
    private final ArrayList<PlanoDeSaude> planoDeSaudeArrayList = new ArrayList<>();

    public void cadastrar(PlanoDeSaude c) {
        this.planoDeSaudeArrayList.add(c);
    }

    public void listar() {
        for (PlanoDeSaude objeto : this.planoDeSaudeArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public PlanoDeSaude buscar(String nome) {//pode-se usar também int
        PlanoDeSaude c = null;
        for (PlanoDeSaude objeto : this.planoDeSaudeArrayList) {
            if (objeto.getNome().equals(nome)) {
                c = objeto;
                break;
            }
        }
        return c;
    }

    //este método usa o método buscar já implementado
    public boolean excluir(String nome) {
        PlanoDeSaude c = this.buscar(nome);
        if (c != null) {
            this.planoDeSaudeArrayList.remove(c);
            return true;
        } else return false;
    }
}
