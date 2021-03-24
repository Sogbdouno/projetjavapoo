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
public class Evaluation {
    private String type;
    private String date;
    private String duree;
    
    public Evaluation(){
        
    }
    
    public Evaluation(String type, String date, String duree){
        this.type = type;
        this.date = date;
        this.duree = duree;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getDuree() {
        return duree;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }
    
    public String toString(){
        return("/type:"+type+ "/date:"+date+ "duree:"+duree);
    }
    
}
