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
    private String nomModule;
    private String volumeHoraire;
    private int coefficient;
    private String description;
    
    public Module(){
        
    }
    
    public Module(String nomModule, String volumeHoraire, int coefficient, String description){
        this.nomModule = nomModule;
        this.volumeHoraire = volumeHoraire;
        this.coefficient = coefficient;
        this.description = description;
    }

    public String getNomModule() {
        return nomModule;
    }

    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }

    public String getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(String volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Module{" + "nomModule=" + nomModule + ", volumeHoraire=" + volumeHoraire + ", coefficient=" + coefficient + ", description=" + description + '}';
    }

    
    
   
}
