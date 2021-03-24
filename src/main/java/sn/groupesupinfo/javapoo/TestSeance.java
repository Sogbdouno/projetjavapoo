/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.javapoo;

/**
 *
 * @author boubadiop
 */
public class TestSeance {
    public static void main(String[]args){
        Seance s1 = new Seance();
        s1.setDate("12 fevrier 2020");
        s1.setHeureDebut("12h");
        s1.setHeureFin("14h");
        s1.setSoldeHeure("30min");
        s1.setProfesseur("Mohamed Bah");
        s1.setModule("Python");
        s1.setGroupe("PR310");
        s1.setSalleDeClasse("NetWork");
        s1.setResumeSeance("interessant");
        
        Seance s2 = new Seance("20 Mars 2020", "09h","14h","30min","Diaw","java","pr215","Blu","interessant");
        
        System.out.println(s1);
        System.out.println("========================================");
        System.out.println(s2);
    }
}
