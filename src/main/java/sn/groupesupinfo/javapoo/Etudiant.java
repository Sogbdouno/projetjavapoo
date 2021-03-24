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
    private String prenomContact;
    private String nomContact;
    private String telephoneContact;
    private String emailContact;
    
    public Etudiant(){
        
    }
    
    public Etudiant(String prenomContact, String nomContact, String telephoneContact, String emmailContact){
        this.prenomContact = prenomContact;
        this.nomContact = nomContact;
        this.telephoneContact = telephoneContact;
        this.emailContact = emailContact;
    }
    
    public Etudiant(String prenom_contact, String nom_contact){
        this.prenomContact = prenom_contact;
        this.nomContact = nomContact;
    }

    public String getPrenomContact() {
        return prenomContact;
    }

    public void setPrenomContact(String prenomContact) {
        this.prenomContact = prenomContact;
    }

    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getTelephoneContact() {
        return telephoneContact;
    }

    public void setTelephoneContact(String telephoneContact) {
        this.telephoneContact = telephoneContact;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "prenomContact=" + prenomContact + ", nomContact=" + nomContact + ", telephoneContact=" + telephoneContact + ", emailContact=" + emailContact + '}';
    }
    
    

    
    
    
}
