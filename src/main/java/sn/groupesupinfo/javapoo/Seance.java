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
public class Seance {
    private String date;
    private String heureDebut;
    private String heureFin;
    private String soldeHeure;
    private String professeur;
    private String module;
    private String groupe;
    private String salleDeClasse;
    private String resumeSeance;
    
    public Seance(){
        
    }
    
    public Seance(String date, String deureDebut, String heureFin, String soldeHeure,
                   String professeur, String module, String groupe, String salleDeClasse,
                   String resmeSeance){
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.soldeHeure = soldeHeure;
        this.professeur = professeur;
        this.module = module;
        this.groupe = groupe;
        this.salleDeClasse = salleDeClasse;
        this.resumeSeance = resumeSeance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getSoldeHeure() {
        return soldeHeure;
    }

    public void setSoldeHeure(String soldeHeure) {
        this.soldeHeure = soldeHeure;
    }

    public String getProfesseur() {
        return professeur;
    }

    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getSalleDeClasse() {
        return salleDeClasse;
    }

    public void setSalleDeClasse(String salleDeClasse) {
        this.salleDeClasse = salleDeClasse;
    }

    public String getResumeSeance() {
        return resumeSeance;
    }

    public void setResumeSeance(String resumeSeance) {
        this.resumeSeance = resumeSeance;
    }

    @Override
    public String toString() {
        return "Seance{" + "date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", soldeHeure=" + soldeHeure + ", professeur=" + professeur + ", module=" + module + ", groupe=" + groupe + ", salleDeClasse=" + salleDeClasse + ", resumeSeance=" + resumeSeance + '}';
    }

    
    
    
}
