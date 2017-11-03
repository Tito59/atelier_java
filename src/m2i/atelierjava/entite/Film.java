/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Film {
    private String titre;
    private String synopsis;
    private int anneeDeProduction;
    private Date dateCreation;
    
    
    public void filmAffiche(){
        System.out.println(String.format("Film : %s %d %s %s", this.titre,this.anneeDeProduction,this.synopsis,this.dateCreation));
    }
    
    public void initialiseFilm(String titre,int anneeDeProduction, String sypnopsis){
        this.titre = titre;
        this.anneeDeProduction = anneeDeProduction;
        this.synopsis = sypnopsis;
        this.dateCreation = new Date();
    }
    
    public String getTitre(){
        return titre;
    }
    
    public void setTitre(String titre){
        this.titre = titre ;
    }
    
    public int getAnneeDeProduction(){
        return anneeDeProduction;
    }
    
    public void setAnneeDeProduction(int anneeDeProduction){
        this.anneeDeProduction = anneeDeProduction;
    }
}
