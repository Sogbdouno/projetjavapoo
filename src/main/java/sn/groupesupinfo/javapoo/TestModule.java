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
public class TestModule {
    public static void main(String[]agrs){
        Module m1 = new Module();
        m1.setNom_module("Python");
        m1.setVolume_horaire("20h");
        m1.setCoefficient(2);
        m1.setDescription("Programmation oriente objet en python");
        
        Module m2 = new Module("JAVA", "20h",2,"Prorammation oriente objet en java");
        
        System.out.println(m1);
        System.out.println("======================");
        System.out.println(m2);
    }
    
}
