package DataClass;

import Modules.Funcionarios;
import Modules.Persist;

import java.util.ArrayList;

public class DadosFuncionarios {
    private static ArrayList<Funcionarios> funcionariosArrayList = new ArrayList<>();

    public static boolean inicializaFuncionarios() {
        funcionariosArrayList = (ArrayList<Funcionarios>) Persist.recuperar("src/DataSource/Funcionarios.dat");
        if (funcionariosArrayList == null) {
            funcionariosArrayList = new ArrayList<>();
        }
        return true;
    }

    public static boolean cadastrar(Funcionarios c) {
        funcionariosArrayList.add(c);
        Persist.gravar(funcionariosArrayList, "src/DataSource/Funcionarios.dat");
        return true;

    }

    public static void listar() {
        for (Funcionarios objeto : funcionariosArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Funcionaios caso encontrado, ou null, caso não encontrado
    public static Funcionarios buscar(String cpf) {//pode-se usar também int
        Funcionarios c = null;
        for (Funcionarios objeto : funcionariosArrayList) {
            if (objeto.getCpf().equals(cpf)) {
                c = objeto;
                break;
            }
        }
        return c;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String cpf) {
        Funcionarios c = buscar(cpf);
        if (c != null) {
            funcionariosArrayList.remove(c);
            return true;
        }
        return false;
    }
}
//TODO perguntar a professora se é melhor retornar true/false ou uma mensagem de erro

//TODO como fazer o instanceof para uma clase neta

