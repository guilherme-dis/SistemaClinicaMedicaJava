package Modules;
//TODO IMPLEMENTAR O ENDEREÇO

import DataClass.*;


import java.io.Serializable;
import java.util.Date;

public class App implements Serializable {

    public static void main(String[] args) {
        Date date;
        date = new Date();
//TODO, TESTAR TODAS AS LISTAGENS e ver se os dados estão mesmo sendo cadastrados

        //TODO ver se quando eu excluo, exclui do arquivo
        //Cadastro dos exames
        DadosExames.inicializaExames();
        DadosPlanosDeSaude.inicializaPlanoDeSaude();
        DadosPacientes.inicializaPacientes();
        DadosFuncionarios.inicializaFuncionarios();
        DadosConsulta.inicializaConsulta();

        /*
        DadosExames.inicializaExames();
        DadosExames.cadastrar(new Exames("Hemograma", 0, 20));
        DadosExames.cadastrar(new Exames("Covid", 0, 160));
        DadosExames.cadastrar(new Exames("Glicemia", 0, 40));
        DadosExames.cadastrar(new Exames("Colesterol", 0, 45));
        DadosExames.cadastrar(new Exames("Ureia", 0, 60));
        DadosExames.cadastrar(new Exames("Transaminases", 0, 100));
        DadosExames.listar();
        */



        //Cadastro dos plano de saúde
        /*
        DadosPlanosDeSaude.inicializaPlanoDeSaude();
        DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("Votorantim", "55555"));
        DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("SulAmérica", "55555"));
        DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("NotreDame Intermédica", "55555"));
        DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("Prevent Senior", "55555"));
        DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("Assim Saúde", "55555"));
        DadosPlanosDeSaude.listar();*/


        //Cadastro de pacientes
/*
        //DadosPacientes.inicializaPacientes();
        date = new Date();
        DadosPacientes.cadastrar(new PacienteComPlanoDeSaude("Guilherme Dias Cardoso Silva", "70122924665", "11111", "Solteiro", "Masculino", date, date, DadosPlanosDeSaude.buscar("Assim Saúde"), "", "", date));
        DadosPacientes.cadastrar(new PacienteSemPlanoDeSaude("Guilherme", "40778470016", "11111", "Solteiro", "Masculino", date, date, 50f));;
        DadosPacientes.listar();*/



        //Cadastro de funcionarios.
        /*
        //DadosFuncionarios.inicializaFuncionarios();

        date = new Date();
        //Funcionarios
        DadosFuncionarios.cadastrar(new OutrosFuncionarios("Guilherme", "63199245005", "11111", "Solteiro", "", "", "", date, 1000, 1000, 100, "Atendente", 0, 10));
        //Medicos
        DadosFuncionarios.cadastrar(new Medicos("Guilherme", "13924830002", "11111", "Solteiro", "", "", "", date, 1000, "", new String[]{"sangue", "Hepatite"}, 10, 100, 0, new String[]{"Hemograma", "Covid"}, 50));
        DadosFuncionarios.listar();*/





        //Cadastro consulta
        /*
        String[] exames1 = new String[]{"Hemograma", "Glicemia", "Colesterol", "Transaminases"};
        String[] exames2 = new String[]{"Hemograma", "Colesterol", "Transaminases"};

        date = new Date();
        DadosConsulta.inicializaConsulta();

        //DadosConsulta.cadastrar(new Consulta(date, "", "", "", DadosPacientes.buscar("70122924665"), DadosFuncionarios.buscar("13924830002"), exames1, DadosFuncionarios.buscar("63199245005")));
        //DadosConsulta.cadastrar(new Consulta(date, "", "", "", DadosPacientes.buscar("40778470016"), DadosFuncionarios.buscar("13924830002"), exames2, DadosFuncionarios.buscar("63199245005")));
        DadosConsulta.listar();
*/




        System.out.println(DadosConsulta.buscar("70122924665").realizarConsulta());
        System.out.println(DadosConsulta.buscar("40778470016").realizarConsulta());
    }
    public void menu(){

    }
}
