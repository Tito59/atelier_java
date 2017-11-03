/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SerieTest {
    
    @Test
    public void affichageOK() {
        
        Serie s1 = new Serie();
        s1.initialise("Game of Throne", 2011, 7, "Coucou");
        
        Serie s2 = new Serie();
        s2.initialise("Breaking Bad", 2008, 2, "Aurevoir");
        
        s1.serieAffiche();
        s2.serieAffiche();
    }
    
}
