/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class VehiculeTest {
    
    //@Test
    public void testVehicule(){
        Vehicule v1 = new Vehicule("Peugeot", false, "206", "orange", 4, 0, 0, 0,5);
        v1.afficher();
        v1.avancer();
        v1.setPas(3);
        v1.afficher();
        v1.avancer();
        v1.afficher();
    }
    
    //@Test
    public void testAvion(){
        Avion a = new Avion("airbus", false, "A-100", "Blanche", 100, 0, 0, 0, 10);
        a.avancer();
        a.afficher();
        a.setPas(20);
        a.reculer();
        a.afficher();
    }
    
    @Test
    public void testSousMarin(){
        SousMarin sm = new SousMarin("Nucléaire", false, "F-260", "Noire", 100, 0, 0, 0, 50,true);
        sm.afficher();
        sm.avancer();
        sm.afficher();
        sm.setPas(60);
        sm.setPlonge(false);
        sm.avancer();
        sm.afficher();
        sm.droite();
        sm.setPlonge(true);
        sm.setPas(5);
        sm.reculer();
        sm.afficher();
    }
}
