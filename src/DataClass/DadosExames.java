package DataClass;

import Modules.Exames;

import java.util.ArrayList;

public class DadosExames {
    private final ArrayList<Exames> examesArrayList = new ArrayList<>();

    public void cadastrar(Exames c) {
        this.examesArrayList.add(c);
    }

    public void listar() {
        for (Exames objeto : this.examesArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public Exames buscar(String nome) {//pode-se usar também int
        Exames c = null;
        for (Exames objeto : this.examesArrayList) {
            if (objeto.getNome().equals(nome)) {
                c = objeto;
                break;
            }
        }
        return c;
    }

    //este método usa o método buscar já implementado
    public boolean excluir(String nome) {
        Exames c = this.buscar(nome);
        if (c != null) {
            this.examesArrayList.remove(c);
            return true;
        } else return false;
    }
}
