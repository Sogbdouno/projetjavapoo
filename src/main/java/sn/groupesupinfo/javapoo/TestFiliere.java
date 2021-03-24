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
public class TestFiliere {
    public static void main(String[]args){
        Filiere f1 = new Filiere();
        f1.setNom("Programmation");
        f1.setDescription("Etude de differents langages informatique");
        
        Filiere f2 = new Filiere("Marketing", "Etude me marché");
        
        System.out.println(f1);
        System.out.println("===================================");
        System.out.println(f2);
    }
}
