package Modules;

import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args) {


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

        //Cadastro de pacientes com plano de saúde
        Date date = new Date();
        ArrayList<PacienteComPlanoDeSaude> pacienteComPlanoDeSaudeArrayList = new ArrayList<>();
        PacienteComPlanoDeSaude Paciente = new PacienteComPlanoDeSaude("Guilherme", "70122924665", "11111", "Solteiro", "Masculino", date, date, planoDeSaude[0], "", "", date);
        pacienteComPlanoDeSaudeArrayList.add(Paciente);


        //Cadastro de paciente sem o plano de saúde.  O objeto date já esta delarado, vou utilizar.
        ArrayList<PacienteSemPlanoDeSaude> pacienteSemPlanoDeSaudeArrayList=new ArrayList<>();
        PacienteSemPlanoDeSaude Paciente2 =new PacienteSemPlanoDeSaude("Guilherme", "70122924665", "11111", "Solteiro", "Masculino", date, date,50f);
        pacienteSemPlanoDeSaudeArrayList.add(Paciente2);

        //Cadastro de outros funcionários.
        ArrayList<OutrosFuncionarios> outrosFuncionariosArrayList=new ArrayList<>();
        OutrosFuncionarios outro=new OutrosFuncionarios("Guilherme", "70122924665", "11111", "Solteiro","","","",date,1000,1000,100,"Atendente",0,10);
        outrosFuncionariosArrayList.add(outro);

        //Cadastro de médicos
        ArrayList<Medicos> medicosArrayList=new ArrayList<>();
        String[] especialidades={"sangue","Hepatite" };
        String[] plano={"Hemograma","Covid" };
        Medicos medico=new Medicos("Guilherme", "70122924665", "11111", "Solteiro","","","",date,1000,"",especialidades,10,100,0,plano);

        //Criando a consulta

        String[] exames1= new String[]{"Hemograma", "Glicemia", "Colesterol", "Transaminases"};
        String[] exames2=new String[]{"Hemograma","Colesterol","Transaminases "};
        Consulta consulta =new Consulta(date,"","","",Paciente,medico,exames,exames1,outro);
        Consulta consulta2 =new Consulta(date,"","","",Paciente2,medico,exames,exames2,outro);

        System.out.println(consulta.realizarConsulta());
        System.out.println(consulta2.realizarConsulta());
    }
}
