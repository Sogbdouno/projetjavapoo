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
public class TestProfesseur {
    public static void main(String [] args){
        Professeur p1 = new Professeur();
        p1.setSpecialite("Python");
        
        Professeur p2 = new Professeur("Java");
        
        System.out.println(p1);
        System.out.println("======================");
        System.out.println(p2);
    }
}
