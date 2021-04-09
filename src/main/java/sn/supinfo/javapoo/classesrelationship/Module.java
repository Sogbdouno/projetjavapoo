/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.classesrelationship;

/**
 *
 * @author boubadiop
 */
public class Module {
    private int id;
    private String nom;
    private int volumeHoraire;
    private int coefficient;
    
    public Module(){
        
    }
    
    public Module(int id,String nom,int volumeHoraire,int coefficient){
        this.id = id;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.coefficient = coefficient;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the volumeHoraire
     */
    public int getVolumeHoraire() {
        return volumeHoraire;
    }

    /**
     * @param volumeHoraire the volumeHoraire to set
     */
    public void setVolumeHoraire(int volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    /**
     * @return the coefficient
     */
    public int getCoefficient() {
        return coefficient;
    }

    /**
     * @param coefficient the coefficient to set
     */
    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Module{" + "id=" + id + ", nom=" + nom + ", volumeHoraire=" + volumeHoraire + ", coefficient=" + coefficient + '}';
    }
    
    
    
}
