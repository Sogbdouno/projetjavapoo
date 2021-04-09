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
public class SeanceFormation {
    private String date;
    private String heureDebut;
    private String heureFin;
    private SalleFormation salleFormation;
    private Module module;

    public SeanceFormation() {
    }

    public SeanceFormation(String date, String heureDebut, String heureFin, SalleFormation salleFormation, Module module) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salleFormation = salleFormation;
        this.module = module;
    }
    
    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the heureDebut
     */
    public String getHeureDebut() {
        return heureDebut;
    }

    /**
     * @param heureDebut the heureDebut to set
     */
    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    /**
     * @return the heureFin
     */
    public String getHeureFin() {
        return heureFin;
    }

    /**
     * @param heureFin the heureFin to set
     */
    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    /**
     * @return the salleFormation
     */
    public SalleFormation getSalleFormation() {
        return salleFormation;
    }

    /**
     * @param salleFormation the salleFormation to set
     */
    public void setSalleFormation(SalleFormation salleFormation) {
        this.salleFormation = salleFormation;
    }

    /**
     * @return the module
     */
    public Module getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(Module module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "SeanceFormation{" + "date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", salleFormation=" + salleFormation + ", module=" + module + '}';
    }
    
    
    
    
    
    
}
