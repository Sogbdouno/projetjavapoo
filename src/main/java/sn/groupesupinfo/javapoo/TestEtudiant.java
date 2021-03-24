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
public class TestEtudiant {
    public static void main(String [] args){
        Etudiant e1 = new Etudiant();
        e1.setPrenom_contact("Martinou");
        e1.setNom_contact("Diatta");
        e1.setTelephone_contact("77-755-89-09");
        e1.setEmail_contact("diatta@gmail.com");
        
        Etudiant e2 = new Etudiant("Abdou Bacar", "Chanfi","chanfi@gmail.com","77-677-09-23");
        
        Etudiant e3 = new Etudiant("Ibrahima Nabi", "Diallo");
        
        System.out.println(e1);
        System.out.println("======================================");
        System.out.println(e2);
        System.out.println("========================================");
        System.out.println(e3);
    }
    
}
