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
    private String nom_groupe;
    private String date_creation;
    
    public Groupe(){
        
    }
    
    public Groupe(String nom_groupe, String date_creation){
        this.nom_groupe = nom_groupe;
        this.date_creation = date_creation;
    }

    public String getNom_groupe() {
        return nom_groupe;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setNom_groupe(String nom_groupe) {
        this.nom_groupe = nom_groupe;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }
    
    public String toString(){
        return("/Nom groupe:"+nom_groupe+ "/Date creation:"+date_creation);
    }
}
