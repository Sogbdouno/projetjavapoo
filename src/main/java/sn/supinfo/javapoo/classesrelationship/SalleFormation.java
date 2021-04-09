/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.classesrelationship;

/**
 *
 * @author boubadiop
 * pwrmet de memoriser les informations sur une salle de formation
 */
public class SalleFormation {
    private int id;
    private String nom;
    private int capacite;
    private SeanceFormation[] seanceFormation = new SeanceFormation[5];

    public SalleFormation() {
    }

    public SalleFormation(int id, String nom, int capacite) {
        this.id = id;
        this.nom = nom;
        this.capacite = capacite;
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
     * @return the capacite
     */
    public int getCapacite() {
        return capacite;
    }

    /**
     * @param capacite the capacite to set
     */
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public SeanceFormation[] getSeanceFormation() {
        return seanceFormation;
    }

    public void setSeanceFormation(SeanceFormation[] seanceFormation) {
        this.seanceFormation = seanceFormation;
    }

    
    
    @Override
    public String toString() {
        return "SalleFormation{" + "id=" + id + ", nom=" + nom + ", capacite=" + capacite + '}';
    }
    
    
    
}
