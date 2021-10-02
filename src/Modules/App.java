package Modules;
//TODO IMPLEMENTAR O ENDEREÇO

import DataClass.*;

import java.io.Serializable;
import java.util.Date;

public class App implements Serializable {

    public static void main(String[] args) {
        //TODO aprender a trabalhar ocm o date.
        Date date = new Date();
        startData();
        System.out.println("Bem vindo ao sistema!");


        DadosExames.listar();
        System.out.println();
        DadosPlanosDeSaude.listar();
        System.out.println();
        DadosPacientes.listar();
        System.out.println();
        DadosFuncionarios.listar();




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

/*
        System.out.println("Valor que o paciente vai pagar sem plano de saude vai pagar " + DadosConsulta.buscar("70122924665").realizarConsulta());
        System.out.println("Valor que o paciente vai pagar com plano de saude vai pagar " + DadosConsulta.buscar("40778470016").realizarConsulta());*/

        saveData();
    }

    public static void menu() {
        System.out.println("Qual é a opção desejada?");
        System.out.println("1-Cadastrar Exames.");
        System.out.println("2-Listar Exames.");
        System.out.println("3-Buscar os dados de um Exame");
        System.out.println("4-Excluir um Exame");
        System.out.println();
        System.out.println("5-Cadastrar Plano de saúde.");
        System.out.println("6-Listar Planos de saúde.");
        System.out.println("7-Buscar os dados de um Plano de saúde.");
        System.out.println("8-Excluir um Plano de saúde.");
        System.out.println();
        System.out.println("9-Cadastrar um Paciente COM plano de Saude.");
        System.out.println("10-Listar Pacientes COM plano de Saude.");
        System.out.println("11-Buscar os dados de um Paciente COM plano de Saude.");
        System.out.println("12-Excluir um Paciente COM plano de Saude.");
        System.out.println();
        System.out.println("13-Cadastrar um Paciente SEM plano de Saude.");
        System.out.println("14-Listar Pacientes SEM plano de Saude.");
        System.out.println("15-Buscar os dados de um Paciente SEM plano de Saude.");
        System.out.println("16-Excluir um Paciente SEM plano de Saude.");
        System.out.println();
        System.out.println("17-Cadastrar um Funcionario.");
        System.out.println("18-Listar Funcionarios.");
        System.out.println("19-Buscar um Funcionario.");
        System.out.println("20-Excluir um Funcionario.");
        System.out.println();
        System.out.println("21-Cadastrar um Médico");
        System.out.println("22-Listar um Médico");
        System.out.println("23-Buscar um Médico");
        System.out.println("24-Excluir um Médico");
        System.out.println();
        System.out.println("25-Cadastrar uma Consulta");
        System.out.println("26-Listar Uma Consulta");
        System.out.println("27-Buscar uma Consulta");
        System.out.println("28-Excluir uma Consulta");


    }

    public static void startData() {
        DadosExames.inicializaExames();
        DadosPlanosDeSaude.inicializaPlanoDeSaude();
        DadosPacientes.inicializaPacientes();
        DadosFuncionarios.inicializaFuncionarios();
        DadosConsulta.inicializaConsulta();
    }

    public static void saveData() {
        DadosConsulta.gravar();
        DadosExames.gravar();
        DadosFuncionarios.gravar();
        DadosPacientes.gravar();
        DadosPlanosDeSaude.gravar();
    }
}
//Cadastro dos exames
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
        DadosPacientes.cadastrar(new PacienteComPlanoDeSaude("Arthur","90718598008","36939488","casado",new Endereco("Graziel ferreira amorin","casa","bela vista","itau",780,37975000),"muito",date,date,DadosPlanosDeSaude.buscar("Assim Sa&uacute;de"), "", "", date));
        DadosPacientes.cadastrar(new PacienteSemPlanoDeSaude("Guilherme Dias Cardoso Silva","70122924665","192168","solteiro",new Endereco("waldomiro caetano machado","casa","nova california","passos",81,37904570),"masculino",date,date,20));

        DadosPacientes.listar();*/

//Cadastro de funcionarios.
        /*
        DadosFuncionarios.cadastrar(new OutrosFuncionarios("Isadora Maria","44225173097","5555","casado",new Endereco("Graziel ferreira amorin","casa","bela vista","itau",780,37975000),"isadora","isa123","1111",date,1100,250,"Secretaria",10));
        DadosFuncionarios.cadastrar(new Medicos("Carlos","26776897077","5555","casado",new Endereco("Graziel ferreira amorin","casa","bela vista","itau",780,37975000),"carlin","carlin777","1111",date,7000,"7777",new String[]{"sangue", "Hepatite"}, 10, 100, new String[]{"Hemograma", "Covid"}, 50));
        DadosFuncionarios.listar();*/