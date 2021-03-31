/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.javapoo.heritage;

/**
 *
 * @author boubadiop
 */
public class TestPersonne {
    public static void main(String[]args){
       Personne p = new Personne();
       p.setId(1);
       p.setMatricule("123456789");
       p.setPrenom("Fode");
       p.setNom("Keita");
       p.setDateNaissance("11/11/1988");
       p.setLieuNaissance("Kaolack");
       p.setAdresse("2, AV Birago Diop");
       p.setTelephone("77-598-14-57");
       p.setEmail("fode@gmail.com");
       p.setNationalite("Senegalais");
       p.setGenre("M");
       p.setSituationMatrimonial("Marié");
       
       Etudiant etudiant = new Etudiant(1,"123456","Mballou","Ndoumbouya",
               "12/03/1998","Conakry","Liberte 5","77-908-06-05",
               "mballou@gmail.com","Guinenne","F","Marié","O+");
       
       Professeur professeur = new Professeur(1,"123456","Mohamed","Ba",
               "12/03/1967","Conakry","Liberte 1","77-908-06-05",
               "bau@gmail.com","Guinenne","F","Marié","Mathematicien");
       
       ResponsableFiliere rf = new ResponsableFiliere(1,"123456","Mohamed","Ba",
               "12/03/1967","Conakry","Liberte 1","77-908-06-05",
               "bau@gmail.com","Guinenne","F","Marié",
               "Coordonnés les activites pedagogiques");
       
       Secretaire secretaire = new Secretaire(1,"123456","Hawa","Diallo",
               "12/03/1997","Dakar","Liberte 6","77-968-06-05",
               "bau@gmail.com","Senegalaise","F","Mariée","gerer les agendas");
       
       System.out.println(p);
       System.out.println("==========================================");
       System.out.println(etudiant);
       System.out.println("==========================================");
       System.out.println(professeur);
       System.out.println("==========================================");
       System.out.println(etudiant.getPrenom());
       System.out.println("==========================================");
       System.out.println(rf);
       
       
    }
}

