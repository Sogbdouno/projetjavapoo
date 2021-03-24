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
public class TestFicheNotes {
    public static void main(String[]args){
        FicheNotes f1 = new FicheNotes();
        f1.setNumFicheNote("234567");
        f1.setDate("janvier 2019");
        
        FicheNotes f2 = new FicheNotes("6789", "Avril 2020");
        
        System.out.println(f1);
        System.out.println("===============================");
        System.out.println(f2);
    }
}
