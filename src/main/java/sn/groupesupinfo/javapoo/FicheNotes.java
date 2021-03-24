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
public class FicheNotes {
    private String numFicheNote;
    private String date;
    
    public FicheNotes(){
        
    }
    
    public FicheNotes(String numFicheNotes, String date){
        this.numFicheNote = numFicheNotes;
        this.date = date;
    }

    public String getNumFicheNote() {
        return numFicheNote;
    }

    public String getDate() {
        return date;
    }

    public void setNumFicheNote(String numFicheNote) {
        this.numFicheNote = numFicheNote;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FicheNotes{" + "numFicheNote=" + numFicheNote + ", date=" + date + '}';
    }
    
    
}
