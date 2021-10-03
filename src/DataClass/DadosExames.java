package DataClass;

import Modules.Exames;
import Modules.Persist;

import java.util.ArrayList;

public class DadosExames {
    private static ArrayList<Exames> examesArrayList = new ArrayList<>();

    public static boolean inicializaExames() {
        examesArrayList = (ArrayList<Exames>) Persist.recuperar("src/DataSource/Exames.dat");
        if (examesArrayList == null) {
            examesArrayList = new ArrayList<>();
        }
        return true;
    }

    public static boolean cadastrar(Exames c) {
        if (buscar(c.getNome()) == null) {
            examesArrayList.add(c);
            return true;
        } else System.out.println("já esta cadastrado");
        return true;
    }

    public static void gravar() {
        Persist.gravar(examesArrayList, "src/DataSource/Exames.dat");
    }

    public static void listar() {
        for (Exames objeto : examesArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public static Exames buscar(String nome) {//pode-se usar também int
        Exames c = null;
        for (Exames objeto : examesArrayList) {
            if (objeto.getNome().equals(nome)) {
                c = objeto;
                break;
            }
        }
        return c;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String nome) {
        Exames c = buscar(nome);
        if (c != null) {
            examesArrayList.remove(c);
            return true;
        }
        return false;
    }

}
