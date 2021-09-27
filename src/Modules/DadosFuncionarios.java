package Modules;

import java.util.ArrayList;

public class DadosFuncionarios {
    private final ArrayList<Funcionarios> funcionariosArrayList = new ArrayList<>();

    public void cadastrar(Funcionarios c) {
        this.funcionariosArrayList.add(c);
    }

    public void listar() {
        for (Funcionarios objeto : this.funcionariosArrayList) System.out.println(objeto);
    }

    //este método retorna o objeto Funcionaios caso encontrado, ou null, caso não encontrado
    public Funcionarios buscar(String cpf) {//pode-se usar também int
        Funcionarios c = null;
        for (Funcionarios objeto : this.funcionariosArrayList) {
            if (objeto.getCpf().equals(cpf)) {
                c = objeto;
                break;
            }
        }
        return c;
    }

    //este método usa o método buscar já implementado
    public boolean excluir(String cpf) {
        Funcionarios c = this.buscar(cpf);
        if (c != null) {
            this.funcionariosArrayList.remove(c);
            return true;
        } else return false;
    }
}
