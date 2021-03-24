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
public class Etudiant {
    private String prenom_contact;
    private String nom_contact;
    private String telephone_contact;
    private String email_contact;
    
    public Etudiant(){
        
    }
    
    public Etudiant(String prenom_conatact, String nom_contact, String telephone_contact, String emmail_contact){
        this.prenom_contact=prenom_contact;
        this.nom_contact=nom_contact;
        this.telephone_contact=telephone_contact;
        this.email_contact=email_contact;
    }
    
    public Etudiant(String prenom_contact, String nom_contact){
        this.prenom_contact=prenom_contact;
        this.nom_contact=nom_contact;
    }

    public String getPrenom_contact() {
        return prenom_contact;
    }

    public String getNom_contact() {
        return nom_contact;
    }

    public String getTelephone_contact() {
        return telephone_contact;
    }

    public String getEmail_contact() {
        return email_contact;
    }

    public void setPrenom_contact(String prenom_contact) {
        this.prenom_contact = prenom_contact;
    }

    public void setNom_contact(String nom_contact) {
        this.nom_contact = nom_contact;
    }

    public void setTelephone_contact(String telephone_contact) {
        this.telephone_contact = telephone_contact;
    }

    public void setEmail_contact(String email_contact) {
        this.email_contact = email_contact;
    }
    
    public String toString(){
        return("/prenom_contact:"+prenom_contact+ "/nom_contact:"+nom_contact+ "/telephone_contact:"+telephone_contact+ "/email_contact:"+email_contact);
    }
}
