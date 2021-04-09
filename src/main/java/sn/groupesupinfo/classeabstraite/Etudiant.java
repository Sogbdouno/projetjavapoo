/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.classeabstraite;

import sn.groupesupinfo.javapoo.*;

/**
 *
 * @author boubadiop
 */
public class Etudiant extends Personne {
  private String filiere;
 
  public Etudiant(){
      
  }
  
  public Etudiant(String prenom,String nom,String adresse,String filiere){
      super(prenom,nom,adresse);
      this.filiere =filiere;
  }
  
  public String getNomComplet(){
      return super.getPrenom()+" "+super.getNom();
  }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
  
     public String toString() {
        return "Etudiant{" + "filière=" + filiere +  '}';
    }
    
    
    
    
}
