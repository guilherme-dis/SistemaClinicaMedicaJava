package Modules;

import DataClass.*;

import java.io.Serializable;
import java.util.Date;

public class App implements Serializable {

    public static void main(String[] args) {
        try {
            Date date = new Date();
            //startData(); //Metodo criado para inicializar tudo de uma vez só
            System.out.println("Bem vindo ao sistema!");


            //Cadastro dos exames
            DadosExames.inicializaExames();
            DadosExames.cadastrar(new Exames("Hemograma", 20, 0));
            DadosExames.cadastrar(new Exames("Covid", 160, 0));
            DadosExames.cadastrar(new Exames("Glicemia", 40, 0));
            DadosExames.cadastrar(new Exames("Colesterol", 30, 0));
            DadosExames.cadastrar(new Exames("Ureia", 20, 0));
            DadosExames.cadastrar(new Exames("Transaminases", 50, 0));
            DadosExames.listar();

            //Cadastro dos plano de saúde
            DadosPlanosDeSaude.inicializaPlanoDeSaude();
            DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("Votorantim", "55555"));
            DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("SulAmérica", "55555"));
            DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("NotreDame Intermédica", "55555"));
            DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("Prevent Senior", "55555"));
            DadosPlanosDeSaude.cadastrar(new PlanoDeSaude("Assim Saúde", "55555"));
            DadosPlanosDeSaude.listar();

            //Cadastro de pacientes
            DadosPacientes.inicializaPacientes();
            DadosPacientes.cadastrar(new PacienteComPlanoDeSaude("Arthur", "90718598008", "36939488", "casado", new Endereco("Graziel ferreira amorin", "casa", "bela vista", "itau", "780", "37975000"), "Masculino", date, date, DadosPlanosDeSaude.buscar("Votorantim"), "", "", date));
            DadosPacientes.cadastrar(new PacienteSemPlanoDeSaude("Guilherme Dias Cardoso Silva", "70122924665", "19215568", "solteiro", new Endereco("waldomiro caetano machado", "casa", "nova california", "passos", "81", "37904570"), "masculino", date, date, 20));
            DadosPacientes.listar();

            //Cadastro de funcionarios.
            DadosFuncionarios.inicializaFuncionarios();
            DadosFuncionarios.cadastrar(new OutrosFuncionarios("Isadora Maria", "44225173097", "55555555", "casado", new Endereco("Graziel ferreira amorin", "casa", "bela vista", "itau", "780", "37975000"), "isadora", "isa123", "1111", date, 1100, "Secretaria"));
            DadosFuncionarios.cadastrar(new Medicos("Carlos", "26776897077", "55555555", "casado", new Endereco("Graziel ferreira amorin", "casa", "bela vista", "itau", "780", "37975000"), "carlin", "carlin777", "1111", date, 7000, "7777", new String[]{"sangue", "Hepatite"}, 10, 100, new PlanoDeSaude[]{DadosPlanosDeSaude.buscar("Votorantim"), DadosPlanosDeSaude.buscar("Prevent Senior")}, 50));
            DadosFuncionarios.listar();


            //Cadastro consulta
            String[] exames1 = new String[]{"Hemograma", "Glicemia", "Colesterol", "Transaminases"};
            String[] exames2 = new String[]{"Hemograma", "Colesterol", "Transaminases"};

            DadosConsulta.cadastrar(new Consulta(date, "Dipirona", "Voltar em uma semana", "Dipirona de 8 em 8 horas", DadosPacientes.buscar("70122924665"), DadosFuncionarios.buscar("26776897077"), exames1, DadosFuncionarios.buscar("44225173097")));
            DadosConsulta.listar();

            //Simulando 3 consultas com o mesmo paciente.
            System.out.println("\nValor que o paciente vai pagar sem plano de saude vai pagar " + DadosConsulta.buscar("70122924665").realizarConsulta());
            System.out.println("\nValor que o paciente vai pagar sem plano de saude vai pagar " + DadosConsulta.buscar("70122924665").realizarConsulta());
            System.out.println("\nValor que o paciente vai pagar sem plano de saude vai pagar " + DadosConsulta.buscar("70122924665").realizarConsulta());

            //Valor a ser pago de gratificação caso o limite de consultas seja atingido.
            OutrosFuncionarios.setValorASerPagoDeGratificacao(100);

            //A cada 50 consultas, os funcionarios ganham o valor de gratificação
            Consulta.setLimiteConsultas(50);


            //Calculando o salário do funcionario
            System.out.println(DadosFuncionarios.buscar("44225173097").calcularSalario());

            //Calculando o salário do médico
            System.out.println(DadosFuncionarios.buscar("26776897077").calcularSalario());

            //3.d, zerar o número de consultas do mes
            Consulta.resetConsultas();

            //Utilizando os métodos abstratos criados para o exercício 5 c
            DadosFuncionarios.buscar("44225173097").resetaInfo();
            DadosFuncionarios.buscar("26776897077").resetaInfo();


        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        //Esse método salva todos os dados.
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
            DadosExames.cadastrar(new Exames("Hemograma", 20, 0));
            DadosExames.cadastrar(new Exames("Covid", 160, 0));
            DadosExames.cadastrar(new Exames("Glicemia", 40, 0));
            DadosExames.cadastrar(new Exames("Colesterol", 30, 0));
            DadosExames.cadastrar(new Exames("Ureia", 20, 0));
            DadosExames.cadastrar(new Exames("Transaminases", 50, 0));
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
        DadosPacientes.cadastrar(new PacienteComPlanoDeSaude("Arthur","90718598008","36939488","casado",new Endereco("Graziel ferreira amorin","casa","bela vista","itau","780","37975000"),"muito",date,date,DadosPlanosDeSaude.buscar("Assim Sa&uacute;de"), "", "", date));
            DadosPacientes.cadastrar(new PacienteSemPlanoDeSaude("Guilherme Dias Cardoso Silva","70122924665","19215568","solteiro",new Endereco("waldomiro caetano machado","casa","nova california","passos","81","37904570"),"masculino",date,date,20));

        DadosPacientes.listar();*/

//Cadastro de funcionarios.
        /*
        DadosFuncionarios.cadastrar(new OutrosFuncionarios("Isadora Maria","44225173097","55555555","casado",new Endereco("Graziel ferreira amorin","casa","bela vista","itau","780","37975000"),"isadora","isa123","1111",date,1100,"Secretaria"));
            DadosFuncionarios.cadastrar(new Medicos("Carlos","26776897077","55555555","casado",new Endereco("Graziel ferreira amorin","casa","bela vista","itau","780","37975000"),"carlin","carlin777","1111",date,7000,"7777",new String[]{"sangue", "Hepatite"}, 10, 100, new PlanoDeSaude[]{DadosPlanosDeSaude.buscar("Votorantim"), DadosPlanosDeSaude.buscar("Prevent Senior")}, 50));

        DadosFuncionarios.listar();*/


/*
//Cadastro consulta
            String[] exames1 = new String[]{"Hemograma", "Glicemia", "Colesterol", "Transaminases"};
            String[] exames2 = new String[]{"Hemograma", "Colesterol", "Transaminases"};

            DadosConsulta.cadastrar(new Consulta(date, "Dipirona", "Voltar em uma semana", "Dipirona de 8 em 8 horas", DadosPacientes.buscar("70122924665"), DadosFuncionarios.buscar("26776897077"), exames1, DadosFuncionarios.buscar("44225173097")));
            DadosConsulta.cadastrar(new Consulta(date, "", "", "", DadosPacientes.buscar("40778470016"), DadosFuncionarios.buscar("13924830002"), exames2, DadosFuncionarios.buscar("63199245005")));
            DadosConsulta.listar();
 */

//System.out.println("Valor que o paciente vai pagar sem plano de saude vai pagar " + DadosConsulta.buscar("70122924665").realizarConsulta());
//System.out.println("Valor que o paciente vai pagar com plano de saude vai pagar " + DadosConsulta.buscar("40778470016").realizarConsulta());