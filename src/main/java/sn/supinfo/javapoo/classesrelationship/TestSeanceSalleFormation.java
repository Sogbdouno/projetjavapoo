/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.classesrelationship;

/**
 *
 * @author boubadiop
 */
public class TestSeanceSalleFormation {
    public static void main(String[]args){
        Module module1 = new Module();
        module1.setId(1);
        module1.setNom("java poo");
        module1.setVolumeHoraire(20);
        module1.setCoefficient(5);
        
        SalleFormation salleFormation1 = new SalleFormation();
        salleFormation1.setId(1);
        salleFormation1.setNom("Blu Ray");
        salleFormation1.setCapacite(30);
        
        SeanceFormation seanceFormation1 = new SeanceFormation();
        seanceFormation1.setDate("06/Avril/2021");
        seanceFormation1.setHeureDebut("15h");
        seanceFormation1.setHeureFin("17h");
        seanceFormation1.setModule(module1);
        seanceFormation1.setSalleFormation(salleFormation1);
        
        SeanceFormation seanceFormation2 = new SeanceFormation();
        seanceFormation2.setDate("07/Avril/2021");
        seanceFormation2.setHeureDebut("12h");
        seanceFormation2.setHeureFin("14h");
        seanceFormation2.setModule(module1);
        seanceFormation2.setSalleFormation(salleFormation1);
        
        SeanceFormation seanceFormation3 = new SeanceFormation();
        seanceFormation3.setDate("06/Avril/2021");
        seanceFormation3.setHeureDebut("15h");
        seanceFormation3.setHeureFin("17h");
        seanceFormation3.setModule(module1);
        seanceFormation3.setSalleFormation(salleFormation1);
        
        SeanceFormation seanceFormation4 = new SeanceFormation();
        seanceFormation4.setDate("06/Avril/2021");
        seanceFormation4.setHeureDebut("15h");
        seanceFormation4.setHeureFin("17h");
        seanceFormation4.setModule(module1);
        seanceFormation4.setSalleFormation(salleFormation1);
        
        SeanceFormation seanceFormation5 = new SeanceFormation();
        seanceFormation5.setDate("06/Avril/2021");
        seanceFormation5.setHeureDebut("15h");
        seanceFormation5.setHeureFin("17h");
        seanceFormation5.setSalleFormation(salleFormation1);
        
        //Ajout des seances de formation à une salle de formation
        
//       
        SeanceFormation [] tabSeances = new SeanceFormation[5];
        tabSeances[0] = seanceFormation1;
        tabSeances[1] = seanceFormation2;
        tabSeances[2] = seanceFormation3;
        tabSeances[3] = seanceFormation4;
        tabSeances[4] = seanceFormation5;
        salleFormation1.setSeanceFormation(tabSeances);
        
        //Affichage des elements
           
        System.out.println("Les salles de formation");
        System.out.println(salleFormation1);
        System.out.println("=======Les seances de formation=========");
        for(SeanceFormation seance:tabSeances){
            System.out.println(seance);
        }
    }
}
