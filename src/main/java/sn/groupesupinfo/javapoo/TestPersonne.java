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
public class TestPersonne {
    public static void main(String[]args){
        
        Personne p1 =new Personne();
        p1.setPrenom("sogbe");
        p1.setNom("douno");
        p1.setAge(29);
        p1.setAdresse("liberte 6");
        p1.setTelephone("77-537-77-88");
        p1.setEmail("hjkhjjk");
        
        
        Personne p2 = new Personne("Fode","keita","ghjj",55,"hjk","hjk");
        Personne p3 = new Personne("ali", "Lo");
        
//        System.out.println(p1.afficher());
//        System.out.println(p2.afficher());
//        System.out.println(p3.afficher());

        System.out.println(p1);
        System.out.println("-------------------------------");
        System.out.println(p2);
        System.out.println("-------------------------------");
        System.out.println(p3);


            

        
    }
}
