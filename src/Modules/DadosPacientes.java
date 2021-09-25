package Modules;
/*Crie classes especiais capazes de manter os dados gerados no sistema. Por
manter, entende-se: cadastrar, consultar e excluir. Para isto, crie as classes “ DadosPacientes ” , “ DadosFuncionarios ” , “DadosConsulta”, etc.. Estas
classes serão responsáveis por encapsular o acesso a cada tipo de dado
específico. Para isto, estas classes devem implementar um ArrayList privado
para armazenar a informação, e métodos públicos para permitir o acesso à
informação (inserir um novo objeto, buscar um objeto, excluir um objeto, etc.). Os objetos de dados deverão ser criados apenas uma vez na classe principal e
utilizados ao longo da execução da */

import java.util.ArrayList;

class DadosPacientes {
    private final ArrayList<Pacientes> pacientesArrayList = new ArrayList<>();

    public void cadastrar(Pacientes c) {
        this.pacientesArrayList.add(c);
    }

    public void listar() {
        for (Pacientes objeto : this.pacientesArrayList) System.out.println(objeto);
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
