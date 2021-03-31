/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.javapoo.heritage;

/**
 *
 * @author boubadiop
 * Permet de memoriser les informations sur un etudiant
 */
public class Etudiant extends Personne {
   
    private String groupeSanguin;
    
    public Etudiant(){
        super();
        
    }
    
    public Etudiant(int id,String matricule,String prenom,String nom,
                    String dateNaissance,String lieuNaissance,String adresse,
                    String telephone,String email,String nationalite,String genre,
                    String situationMatrimonial,String groupeSanguin)
    {
        super(id,matricule,prenom,nom,dateNaissance,lieuNaissance,adresse,
              telephone,email,nationalite,genre,situationMatrimonial);
        
        this.groupeSanguin = groupeSanguin;
        
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }
    
    @Override
    public String getPrenom(){
        return prenom;
    }
    
//    public String getAfficherPrenom(){
//        
//    }

    @Override
    public String toString() {
        return super.toString() + " groupeSanguin=" + groupeSanguin + '}';
    }
    
    
    
}
