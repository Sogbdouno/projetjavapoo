/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.javapoo.heritage;

/**
 *
 * @author boubadiop
 * permet de memoriser les informations sur un secretaire
 */
public class Secretaire extends Personne {
    private String fonction;
    
    public Secretaire(){
        super();
    }
    
    public Secretaire(int id, String matricule, String prenom, String nom, 
            String dateNaissance, String lieuNaissance, String adresse,
            String telephone, String email, String nationalite, String genre, 
            String situationMatrimonial,String fonction)
    {
        
        super(id,matricule,prenom,nom,dateNaissance,lieuNaissance,adresse,
              telephone,email,nationalite,genre,situationMatrimonial);
        this.fonction = fonction;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return super.toString() + "fonction=" + fonction ;
    }
    
    
    
    
    
    
}
