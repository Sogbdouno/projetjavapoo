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
public class Groupe {
    private String nomGroupe;
    private String dateCreation;
    
    public Groupe(){
        
    }
    
    public Groupe(String nomGroupe, String dateCreation){
        this.nomGroupe = nomGroupe;
        this.dateCreation = dateCreation;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Groupe{" + "nomGroupe=" + nomGroupe + ", dateCreation=" + dateCreation + '}';
    }

   
    
    
}
