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
public class TestGroupe {
    public static void main (String [] args){
        Groupe g1 = new Groupe();
        g1.setNomGroupe("PR215");
        g1.setDateCreation("Novembre 2019");
        
        Groupe g2 = new Groupe("PR310", "Janvier 2020");
        
        System.out.println(g1);
        System.out.println("===========================");
        System.out.println(g2);
    }
}
