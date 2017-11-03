/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Serie {
    
    private String titre;
    private int anneeSortie;
    private int nbSaisons;
    private String sypnopsis;
    
        
    public void serieAffiche(){
        System.out.println(String.format("Serie : %s %d %d %s",this.titre,this.anneeSortie,this.nbSaisons,this.sypnopsis));
    }
    
    public void initialise(String titre,int anneeSortie,int nbSaisons,String sypnosis){
        this.titre = titre;
        this.anneeSortie = anneeSortie;
        this.nbSaisons = nbSaisons;
        this.sypnopsis = sypnosis;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public int getNbSaisons() {
        return nbSaisons;
    }

    public void setNbSaisons(int nbSaisons) {
        this.nbSaisons = nbSaisons;
    }

    public String getSypnopsis() {
        return sypnopsis;
    }

    public void setSypnopsis(String synopsis) {
        this.sypnopsis = synopsis;
    }

}
