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

        if (buscar(c.getCpf()) == null) {
            funcionariosArrayList.add(c);
            return true;
        } else {
            System.out.println("Funcionario " + c.getNome() + " já esta cadastrado");
        }
        return true;
    }

    public static boolean gravar() {
        Persist.gravar(funcionariosArrayList, "src/DataSource/Funcionarios.dat");
        return true;
    }

    public static void listar() {
        for (Funcionarios objeto : funcionariosArrayList) {
            System.out.println(objeto);
        }
    }

    public static Funcionarios buscarLogin(String login) {//pode-se usar também int
        Funcionarios c = null;
        for (Funcionarios objeto : funcionariosArrayList) {
            if (objeto.getUsuario() == null ? login == null : objeto.getUsuario().equals(login)) {
                c = objeto;
                break;
            }
        }/*
        if (c == null) {
            throw new IllegalArgumentException("CPF do Funcionario não encontrado.");
        }*/
        return c;
    }

    //este método retorna o objeto Funcionaios caso encontrado, ou null, caso não encontrado
    public static Funcionarios buscar(String cpf) {//pode-se usar também int
        Funcionarios c = null;
        for (Funcionarios objeto : funcionariosArrayList) {
            if (objeto.getCpf().equals(cpf)) {
                c = objeto;
                break;
            }
        }/*
        if (c == null) {
            throw new IllegalArgumentException("CPF do Funcionario não encontrado.");
        }*/
        return c;
    }

    public static ArrayList<Funcionarios> devolve() {//pode-se usar também int
        return funcionariosArrayList;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String cpf) {
        Funcionarios c = buscar(cpf);
        funcionariosArrayList.remove(c);
        return true;
    }

}
