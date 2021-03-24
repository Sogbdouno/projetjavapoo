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
public class Professeur{
    private String specialite;
    
    public Professeur(){
        
    }
    
    public Professeur(String specialite){
        this.specialite = specialite;
        
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Professeur{" + "specialite=" + specialite + '}';
    }
    
    
}
