package Modules;
//TODO IMPLEMENTAR O ENDEREÇO

import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        Date date;

        //Cadastro dos exames
        DadosExames exames = new DadosExames();
        exames.cadastrar(Exames.cadastrar("Hemograma", 0, 20));
        exames.cadastrar(Exames.cadastrar("Covid", 0, 160));
        exames.cadastrar(Exames.cadastrar("Glicemia", 0, 40));
        exames.cadastrar(Exames.cadastrar("Colesterol", 0, 45));
        exames.cadastrar(Exames.cadastrar("Ureia", 0, 60));
        exames.cadastrar(Exames.cadastrar("Transaminases", 0, 100));

        //Cadastro dos plano de saúde
        DadosPlanosDeSaude planoDeSaude = new DadosPlanosDeSaude();
        planoDeSaude.cadastrar(PlanoDeSaude.cadastrar("Votorantim", "55555"));
        planoDeSaude.cadastrar(PlanoDeSaude.cadastrar("SulAmérica", "55555"));
        planoDeSaude.cadastrar(PlanoDeSaude.cadastrar("NotreDame Intermédica", "55555"));
        planoDeSaude.cadastrar(PlanoDeSaude.cadastrar("Prevent Senior", "55555"));
        planoDeSaude.cadastrar(PlanoDeSaude.cadastrar("Assim Saúde", "55555"));


        //Cadastro de pacientes
        DadosPacientes pacientes = new DadosPacientes();
        date = new Date();
        pacientes.cadastrar(PacienteComPlanoDeSaude.cadastroPacienteComPlanoDeSaude("Guilhermessss", "70122924665", "11111", "Solteiro", "Masculino", date, date, planoDeSaude.buscar("Assim Saúde"), "", "", date));
        pacientes.cadastrar(PacienteSemPlanoDeSaude.cadastroPacienteSemPlanoDeSaude("Guilherme", "40778470016", "11111", "Solteiro", "Masculino", date, date, 50f));


        //Cadastro de funcionarios.
        date = new Date();
        DadosFuncionarios funcionarios = new DadosFuncionarios();
        //Funcionarios
        funcionarios.cadastrar(OutrosFuncionarios.cadastrar("Guilherme", "63199245005", "11111", "Solteiro", "", "", "", date, 1000, 1000, 100, "Atendente", 0, 10));
        //Medicos
        funcionarios.cadastrar(Medicos.cadastrarMedico("Guilherme", "13924830002", "11111", "Solteiro", "", "", "", date, 1000, "", new String[]{"sangue", "Hepatite"}, 10, 100, 0, new String[]{"Hemograma", "Covid"}, 50));



        //Cadastro consulta
        String[] exames1 = new String[]{"Hemograma", "Glicemia", "Colesterol", "Transaminases"};
        String[] exames2 = new String[]{"Hemograma", "Colesterol", "Transaminases "};
        DadosConsulta consulta = new DadosConsulta();
        date = new Date();




        consulta.cadastrar(Consulta.cadastrar(date, "", "", "", pacientes.buscar("70122924665"), funcionarios.buscar("13924830002"), exames1, exames, funcionarios.buscar("63199245005")));
        consulta.cadastrar(Consulta.cadastrar(date, "", "", "", pacientes.buscar("40778470016"), funcionarios.buscar("13924830002"), exames1, exames, funcionarios.buscar("63199245005")));


        System.out.println(consulta.buscar("70122924665").realizarConsulta());
        System.out.println(consulta.buscar("40778470016").realizarConsulta());
    }
}
