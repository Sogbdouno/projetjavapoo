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
        s1.setHeure_debut("12h");
        s1.setHeure_fin("14h");
        s1.setSolde_heure("30min");
        
        Seance s2 = new Seance("20 Mars 2020", "09h","14h","30min");
        
        System.out.println(s1);
        System.out.println("========================================");
        System.out.println(s2);
    }
}
