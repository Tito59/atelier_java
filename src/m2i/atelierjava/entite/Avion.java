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
public class Avion extends Vehicule {

    public Avion(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
    }


    public Avion() {
        
    }
    
    @Override
    public void reculer(){
        z = z - 1;
    }

    @Override
    public void avancer(){
        super.avancer();
        this.y = this.y + this.pas;
    }
    
    
    
}
