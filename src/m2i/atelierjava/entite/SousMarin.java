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
public class SousMarin extends Vehicule{
    
    private boolean plonge;

    public SousMarin() {
        
    }

    public SousMarin(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse,boolean plonge) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
        this.plonge = plonge;
    }
    
    @Override
    public void reculer(){
        super.reculer();
        if(plonge==true){
            super.descendre();
        }else{
            super.monter();
            if(y > 0){
                y = 0;
            }
        }
    }
    
    @Override
    public void avancer(){
        super.avancer();
        if(plonge==true){
            super.descendre();
        }else{
            super.monter();
            if(y > 0){
                y = 0;
            }
        }
    }

    public boolean isPlonge() {
        return plonge;
    }

    public void setPlonge(boolean plonge) {
        this.plonge = plonge;
    }
    
    
    
}
