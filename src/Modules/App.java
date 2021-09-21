package Modules;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        PlanoDeSaude[] planoDeSaude =new PlanoDeSaude[5];
        planoDeSaude[0]=new PlanoDeSaude("Votorantim","55555");
        Exames[] exames = new Exames[5];
        exames[0] = new Exames("Hemograma");
        exames[1] = new Exames("Colesterol");
        exames[2] = new Exames("Ureia e Creatinina");
        exames[3] = new Exames("Glicemia");
        exames[4] = new Exames("Covid");

        //TODO alterar isso para um Arraylist
        PacienteSemPlanoDeSaude[] pacienteSemPlanoDeSaude =new PacienteSemPlanoDeSaude[10];
        Date date=new Date();
        pacienteSemPlanoDeSaude[0]=new PacienteSemPlanoDeSaude("Guilherme","70122924665","11111","Solteiro",date,"Masculino",date,date,50f,20f);

        Medicos medicos=new Medicos("Ricardo","70122924665","11111","solteiro","11","11","11",date,50f,"777","hemoglobina",50f,50f,50f,1,planoDeSaude);

    }
}
