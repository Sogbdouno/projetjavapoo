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
public class TestEvaluation {
    public static void main(String[]args){
        Evaluation ev1 = new Evaluation();
        ev1.setType("devoir");
        ev1.setDate("12 Novembre 2020");
        ev1.setDuree("04h");
        
        Evaluation ev2 = new Evaluation("examen", "28 fevrier 2021", "04h");
        
        System.out.println(ev1);
        System.out.println("===========================");
        System.out.println(ev2);
    }
    
}
