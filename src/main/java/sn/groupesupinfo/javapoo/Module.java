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
public class Module {
    private String nom_module;
    private String volume_horaire;
    private int coefficient;
    private String description;
    
    public Module(){
        
    }
    
    public Module(String nom_module, String volume_horaire, int coefficient, String description){
        this.nom_module = nom_module;
        this.volume_horaire = volume_horaire;
        this.coefficient = coefficient;
        this.description = description;
    }

    public String getNom_module() {
        return nom_module;
    }

    public String getVolume_horaire() {
        return volume_horaire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setNom_module(String nom_module) {
        this.nom_module = nom_module;
    }

    public void setVolume_horaire(String volume_horaire) {
        this.volume_horaire = volume_horaire;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString(){
        return("/Nom module:"+nom_module+ "/Volume horaire:"+volume_horaire+ "/Coefficient:"+coefficient+ "/Description:"+description);
    }
}
