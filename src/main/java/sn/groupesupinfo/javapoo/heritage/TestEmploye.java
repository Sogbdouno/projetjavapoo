/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.javapoo.heritage;

/**
 *
 * @author boubadiop
 */
public class TestEmploye {
    public static void main(String[]args){
        Employe emp1 = new Employe("Fode","Kamara",300000000);
        Employe emp2 = new Employe("Aicha","Keita",300000000);
        
        Directeur d1 = new Directeur("Ami","Lo",100000000,350000);
        Directeur d2 = new Directeur("Awa","Lo",34500000,30000);
        
//        System.out.println("Les employés");
//        System.out.println(emp1);
//        System.out.println(emp2);
//        
//        System.out.println("Les Directeurs");
//        System.out.println(d1);
//        System.out.println(d2);

        // polymorphisme: on appele le tosTRING() de chaque objet
        Employe [] tabEmploye = {emp1, emp2, d1, d2};
        for(Employe e: tabEmploye){
            System.out.println(e);
        }

    }
}
