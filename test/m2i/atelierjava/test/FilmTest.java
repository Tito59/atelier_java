/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Film;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class FilmTest {
    
    @Test
    public void nouveauFilm(){
        Film f1 = new Film();
        f1.initialiseFilm("Titanic",1997,"Coucou");
        
        Film f2 = new Film();
        f2.initialiseFilm("Kung-fu Panda",2008,"Aurevoir");
         
        f1.filmAffiche();
        f2.filmAffiche();
    }
    
}
