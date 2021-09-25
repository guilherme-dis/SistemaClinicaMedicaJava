package Modules;
//TODO IMPLEMENTAR O ENDEREÇO

import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        Date date;

        //Cadastro dos exames
        Exames exames = new Exames();
        exames.setExame("Hemograma", 0, 20);
        exames.setExame("Covid", 0, 160);
        exames.setExame("Glicemia", 0, 40);
        exames.setExame("Colesterol", 0, 45);
        exames.setExame("Ureia", 0, 60);
        exames.setExame("Transaminases ", 0, 100);


        //Cadastro dos plano de saúde
        PlanoDeSaude[] planoDeSaude = new PlanoDeSaude[5];
        planoDeSaude[0] = new PlanoDeSaude("Votorantim", "55555");
        planoDeSaude[1] = new PlanoDeSaude("SulAmérica", "55555");
        planoDeSaude[2] = new PlanoDeSaude("NotreDame Intermédica", "55555");
        planoDeSaude[3] = new PlanoDeSaude("Prevent Senior", "55555");
        planoDeSaude[4] = new PlanoDeSaude("Assim Saúde", "55555");


        //Cadastro de pacientes
        DadosPacientes pacientes = new DadosPacientes();
        date = new Date();
        pacientes.cadastrar(PacienteComPlanoDeSaude.cadastroPacienteComPlanoDeSaude("Guilherme", "70122924665", "11111", "Solteiro", "Masculino", date, date, planoDeSaude[0], "", "", date));
        pacientes.cadastrar(PacienteSemPlanoDeSaude.cadastroPacienteSemPlanoDeSaude("Guilherme", "70122924665", "11111", "Solteiro", "Masculino", date, date, 50f));



        //Cadastro de funcionarios.
        date = new Date();
        DadosFuncionarios funcionarios = new DadosFuncionarios();
        //Funcionarios
        funcionarios.cadastrar(OutrosFuncionarios.cadastrar("Guilherme", "70122924665", "11111", "Solteiro", "", "", "", date, 1000, 1000, 100, "Atendente", 0, 10));
        //Medicos
        funcionarios.cadastrar(Medicos.cadastrarMedico("Guilherme", "70122924665", "11111", "Solteiro", "", "", "", date, 1000, "", new String[]{"sangue", "Hepatite"}, 10, 100, 0, new String[]{"Hemograma", "Covid"}, 50));





        //Criando a consulta
        String[] exames1 = new String[]{"Hemograma", "Glicemia", "Colesterol", "Transaminases"};
        String[] exames2 = new String[]{"Hemograma", "Colesterol", "Transaminases "};
        Consulta consulta = new Consulta(date, "", "", "", pacientes.buscar("70122924665"), medico, exames, exames1, outro);
        Consulta consulta2 = new Consulta(date, "", "", "", pacientes.buscar("70122924665"), medico, exames, exames2, outro);

        System.out.println(consulta.realizarConsulta());
        System.out.println(consulta2.realizarConsulta());
    }
}
